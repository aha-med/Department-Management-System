package com.department.exception;

import com.department.entity.ErrorMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class EntityErrorResponse extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NoDepartmentFound.class)
   public ResponseEntity<ErrorMessage> noDepartmrntFound(
            NoDepartmentFound exception){
        ErrorMessage errorMessage=new ErrorMessage(exception.getMessage());
        return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
    }

}
