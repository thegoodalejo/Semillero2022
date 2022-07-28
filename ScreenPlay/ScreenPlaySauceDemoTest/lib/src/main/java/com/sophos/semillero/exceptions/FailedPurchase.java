package com.sophos.semillero.exceptions;

public class FailedPurchase extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FailedPurchase(String message, Throwable exception) {
		super(message, exception);
	}
}
