package com.microBank.accounts.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExeptionHandler extends RuntimeException{

  
  //manage all execeptions
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception exception){
      
        return ResponseEntity
              .status(HttpStatus.BAD_REQUEST)
              .body(exception.getMessage()+ LocalDateTime.now());
              
    }
  }
    
