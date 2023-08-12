package com.shop.app.application.handler;

import com.shop.app.domain.exception.InvalidDataException;
import com.shop.app.domain.exception.ObjectNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
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

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException httpMessageException){
        ErrorResponse objectNotFound = new ErrorResponse(HttpStatus.NOT_FOUND.value(), httpMessageException.getMessage());
        return new ResponseEntity<>(objectNotFound, HttpStatus.NOT_FOUND);
    }

}