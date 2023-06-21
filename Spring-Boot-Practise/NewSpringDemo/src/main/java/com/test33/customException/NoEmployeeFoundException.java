package com.test33.customException;

public class NoEmployeeFoundException extends RuntimeException {
	public NoEmployeeFoundException(String msg) {
		super(msg);
	}
}
