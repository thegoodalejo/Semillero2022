package com.sophos.semillero.exceptions;

public class InvalidCredentials extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidCredentials(String message, Throwable exception) {
		super(message, exception);
	}

}
