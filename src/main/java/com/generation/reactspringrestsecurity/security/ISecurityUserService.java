package com.generation.reactspringrestsecurity.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);
}
