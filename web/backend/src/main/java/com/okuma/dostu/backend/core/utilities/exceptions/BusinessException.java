package com.okuma.dostu.backend.core.utilities.exceptions;

public class BusinessException extends RuntimeException {
	public BusinessException(String message)
	{
		super(message);
	}
}