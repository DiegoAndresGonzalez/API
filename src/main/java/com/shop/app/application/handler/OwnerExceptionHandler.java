package com.shop.app.application.handler;

import com.shop.app.domain.exception.InvalidDataException;
import com.shop.app.domain.exception.ObjectNotFoundException;
import com.shop.app.domain.usecase.OwnerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OwnerExceptionHandler {

    @ExceptionHandler(InvalidDataException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleInvalidDataException(InvalidDataException invalidDataException){
        ErrorResponse invalidData = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), invalidDataException.getMessage());
        return new ResponseEntity<>(invalidData, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ObjectNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleObjectNotFoundException(ObjectNotFoundException objectNotFoundException){
        ErrorResponse objectNotFound = new ErrorResponse(HttpStatus.NOT_FOUND.value(), objectNotFoundException.getMessage());
        return new ResponseEntity<>(objectNotFound, HttpStatus.NOT_FOUND);
    }

}