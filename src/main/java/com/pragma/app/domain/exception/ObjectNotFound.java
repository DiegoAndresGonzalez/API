package com.pragma.app.domain.exception;


public class ObjectNotFound extends RuntimeException {
    public String objectNotFound(String message) {
        return message;
    }
}