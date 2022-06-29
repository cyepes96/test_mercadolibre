package com.test.mercadolibre.exception;

public class BusinessLayerException extends Exception {

	private static final long serialVersionUID = 7366614517972890644L;

	public BusinessLayerException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public BusinessLayerException(String message) {
		super(message);
	}

	public BusinessLayerException(Throwable throwable) {
		super(throwable);
	}
}
