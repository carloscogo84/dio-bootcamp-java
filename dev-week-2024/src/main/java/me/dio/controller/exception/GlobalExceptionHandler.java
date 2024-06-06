package me.dio.controller.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(IllegalArgumentException.class) 
    public ResponseEntity<String> handlebussinesException(IllegalArgumentException bussinesException){
        return new ResponseEntity<>(bussinesException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class) 
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException NotFoundException){
        return new ResponseEntity<>("Resource ID not found.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchElementException.class) 
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException){
        return new ResponseEntity<>("Unexpected server error, see the logs.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
