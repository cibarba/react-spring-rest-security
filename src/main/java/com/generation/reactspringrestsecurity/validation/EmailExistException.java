package com.generation.reactspringrestsecurity.validation;

@SuppressWarnings("serial")
public class EmailExistException extends Throwable{

    public EmailExistException(String message) {
        super(message);
    }
}
