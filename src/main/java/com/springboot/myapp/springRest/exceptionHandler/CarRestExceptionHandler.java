package com.springboot.myapp.springRest.exceptionHandler;

import com.springboot.myapp.springRest.exceptions.CarErrorResponse;
import com.springboot.myapp.springRest.exceptions.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CarRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CarErrorResponse> responseEntity (CarNotFoundException exception){
        CarErrorResponse errorResponse = new CarErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exception.getMessage());
        errorResponse.setTime(System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

   @ExceptionHandler
    public ResponseEntity<CarErrorResponse> responseE (Exception exc){
        CarErrorResponse errorResponse = new CarErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage("Enter a number!");
        errorResponse.setTime(System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
