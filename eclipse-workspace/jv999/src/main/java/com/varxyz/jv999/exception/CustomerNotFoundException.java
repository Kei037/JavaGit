package com.varxyz.jv999.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends EntityNotFoundException {
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
