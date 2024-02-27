package com.youneskarir.springbootjpaonetomanycrud.advice;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> HandleValidation(MethodArgumentNotValidException exception){
        Map<String,String> list = new HashMap<>();
        exception.getBindingResult().getFieldErrors()
                .forEach(item -> list.put(item.getField(), item.getDefaultMessage()));
        return list;
    }
}
