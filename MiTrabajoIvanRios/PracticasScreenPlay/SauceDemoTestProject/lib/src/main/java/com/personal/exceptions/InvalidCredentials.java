package com.personal.exceptions;

public class InvalidCredentials extends AssertionError{

	
	private static final long serialVersionUID = 1L;
	
	public InvalidCredentials(String message, Throwable cause) {
		super(message,cause);
	}

}
