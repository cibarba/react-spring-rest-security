package com.generation.reactspringrestsecurity.registration;

import com.generation.reactspringrestsecurity.db.model.User;
import org.springframework.context.ApplicationEvent;

import java.util.Locale;

@SuppressWarnings("serial")
public class OnRegistrationCompleteEvent extends ApplicationEvent {

    private final String appUrl;
    private final Locale locale;
    private final User user;

    public OnRegistrationCompleteEvent(final Locale locale, final User user, final String appUrl) {
        super(user);
        this.locale = locale;
        this.user = user;
        this.appUrl = appUrl;
    }


    public Locale getLocale() {
        return locale;
    }

    public User getUser() {
        return user;
    }

    public String getAppUrl() {
        return appUrl;
    }
}
