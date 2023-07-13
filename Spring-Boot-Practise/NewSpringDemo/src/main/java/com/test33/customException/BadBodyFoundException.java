package com.test33.customException;

public class BadBodyFoundException extends RuntimeException{
	public BadBodyFoundException(String msg) {
		super(msg);
	}
}
