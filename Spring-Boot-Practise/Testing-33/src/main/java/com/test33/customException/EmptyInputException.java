package com.test33.customException;

public class EmptyInputException extends RuntimeException{
	public EmptyInputException(String str) {
		super(str);
	}
	
//	public EmptyInputException() {
//		System.out.println("Please enter something as input.");
//	}
}
