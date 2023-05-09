package com.luv2Code.springbootRESTcrud.rest;

import com.luv2Code.springbootRESTcrud.Entity.StudentErrorResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestControllerHandler {


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponseModel> handleException(StudentNotFoundException studentNotFoundException){
        StudentErrorResponseModel studentErrorResponseModel = new StudentErrorResponseModel();
        studentErrorResponseModel.setStatus(HttpStatus.NOT_FOUND.value());
        studentErrorResponseModel.setMessage(studentNotFoundException.getMessage());
        studentErrorResponseModel.setTimeScapm(System.currentTimeMillis());
        return new ResponseEntity<>(studentErrorResponseModel,HttpStatus.NOT_FOUND);
    }
//add another Exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponseModel> handleException(Exception studentNotFoundException){
        StudentErrorResponseModel studentErrorResponseModel = new StudentErrorResponseModel();
        studentErrorResponseModel.setStatus(HttpStatus.BAD_REQUEST.value());
        studentErrorResponseModel.setMessage(studentNotFoundException.getMessage());
        studentErrorResponseModel.setTimeScapm(System.currentTimeMillis());
        return new ResponseEntity<>(studentErrorResponseModel,HttpStatus.BAD_REQUEST);
    }
}

