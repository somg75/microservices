package com.niit.msa.item.exception;

public class InvalidItemRequestExpection extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidItemRequestExpection(String message, Throwable ex) {
		super(message, ex);
	}

	public InvalidItemRequestExpection(String message) {
		super(message);
	}

	public InvalidItemRequestExpection(Throwable ex) {
		super(ex);
	}

}
