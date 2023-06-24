package com.pragma.app.domain.exception;

public class InvalidData extends RuntimeException {
    public InvalidData (String message){
        super(message);
    }
}
