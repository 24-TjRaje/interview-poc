package com.interview.interview_poc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class StudentServiceExceptionHandler{

    @ExceptionHandler(StudentServiceException.class)
    public ResponseEntity<ErrorResponse> handleStudentResponse(StudentServiceException sse) {
        ErrorResponse errorResponse = ErrorResponse.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .message(sse.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleOtherResponse(Exception sse) {
        ErrorResponse errorResponse = ErrorResponse.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .message(sse.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
