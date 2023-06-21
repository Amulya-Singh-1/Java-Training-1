package com.test33.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.test33.customException.BadInputException;
import com.test33.customException.EmptyInputException;

@RestControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e){
		return new ResponseEntity<String>("No such element found.", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ClassNotFoundException.class)
	public ResponseEntity<String> handleClassNotFoundException(ClassNotFoundException e){
		return new ResponseEntity<String>("Class Not Found.", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleNoInput(EmptyInputException e) {
		return new ResponseEntity<String>(e.getMessage() , HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BadInputException.class)
	public ResponseEntity<String> handleBadInput(BadInputException e){
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
}
