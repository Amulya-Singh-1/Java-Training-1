package com.test33.customException;

public class NoIdFoundException extends RuntimeException {
	public NoIdFoundException(String msg) {
		super(msg);
	}
}
