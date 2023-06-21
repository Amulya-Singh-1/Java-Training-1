package com.test33.customException;

public class BadInputException extends RuntimeException {

	public BadInputException(String str) {
		super(str);
	}
}
