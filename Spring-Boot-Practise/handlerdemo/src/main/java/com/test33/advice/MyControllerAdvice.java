package com.test33.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.test33.customException.BadInputException;

@RestControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(BadInputException.class)
	public ResponseEntity<String> handleNoSuchElementException(BadInputException e) {
		return new ResponseEntity<>(e.getMessage()+ "dddddd", HttpStatus.BAD_REQUEST);
	}
}
