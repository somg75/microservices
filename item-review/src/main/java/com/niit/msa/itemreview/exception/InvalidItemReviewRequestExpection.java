package com.niit.msa.itemreview.exception;

public class InvalidItemReviewRequestExpection extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidItemReviewRequestExpection(String message, Throwable ex) {
		super(message, ex);
	}

	public InvalidItemReviewRequestExpection(String message) {
		super(message);
	}

	public InvalidItemReviewRequestExpection(Throwable ex) {
		super(ex);
	}

}
