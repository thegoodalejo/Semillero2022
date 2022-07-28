package com.sophos.semillero.exceptions;

public class NoProductsInCart extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoProductsInCart(String message, Throwable exception) {
		super(message, exception);
	}

}
