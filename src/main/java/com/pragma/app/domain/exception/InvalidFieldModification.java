package com.pragma.app.domain.exception;

public class InvalidFieldModification extends RuntimeException{
    public InvalidFieldModification(String message){
        super(message);
    }
}
