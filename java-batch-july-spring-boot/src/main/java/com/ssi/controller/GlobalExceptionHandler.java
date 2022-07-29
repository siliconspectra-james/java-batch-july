package com.ssi.controller;

import com.ssi.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<String> notFoundExceptionHandler(NotFoundException ex) {
        System.out.println(ex.getName() + " not found");
        return new ResponseEntity<>(ex.getName() + " not found", HttpStatus.NOT_FOUND);
    }
}
