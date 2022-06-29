package com.test.mercadolibre.util;

public class ErrorMessages {

	private ErrorMessages() {
	}

	public static final String ERROR_EXCEPTION = "Unhandled error";
	public static final String ERROR_BUSINESS = "Validation error";
	public static final String ERROR_BADREQUEST = "Error in the JSON format";
	public static final String ERROR_MATRIZ_CHARS_NOTALLOWED = "The format contains letters not allowed [A,T,C,G]";
	public static final String ERROR_MATRIZ_NXN = "The matrix does not have the format allowed [NxN]";
	public static final String ERROR_MATRIZ_MINIMUM_SIZE = "The matrix does not have the minimum size allowed [4x4]";
}
