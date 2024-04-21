package com.skoti.learning.exception;

public class NoSuchUserFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoSuchUserFoundException(String message) {
		
		super(message);
	}

}
