package com.pragma.app.domain.exception;

public class ObjectNotFound extends RuntimeException {
    public ObjectNotFound(String message) {
        super(message);
    }
}