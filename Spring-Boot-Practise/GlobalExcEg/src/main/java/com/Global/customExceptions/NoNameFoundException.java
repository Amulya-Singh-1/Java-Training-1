package com.Global.customExceptions;

public class NoNameFoundException extends RuntimeException{
	public NoNameFoundException(String msg) {
		super(msg);
	}
}
