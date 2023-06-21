package com.Global.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Global.customExceptions.NoNameFoundException;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(NoNameFoundException.class)
	public ResponseEntity<String> handleNoNameException(NoNameFoundException e){
		return new ResponseEntity<String>( e.getMessage(), HttpStatus.BAD_REQUEST );
	}
}
