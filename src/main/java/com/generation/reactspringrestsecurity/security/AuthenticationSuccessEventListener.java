package com.generation.reactspringrestsecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private LoginAttemptService loginAttemptService;

    /**
     * Catch all the success authentication events
     * @param authenticationSuccessEvent - Spring Authentication Object
     */
    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent authenticationSuccessEvent) {
        final String xHeader = request.getHeader("X-Forwarder-For");
        if (xHeader == null) {
            loginAttemptService.loginSucceeded(request.getRemoteAddr());
        } else {
            loginAttemptService.loginSucceeded(xHeader.split(",")[0]);
        }
    }
}
