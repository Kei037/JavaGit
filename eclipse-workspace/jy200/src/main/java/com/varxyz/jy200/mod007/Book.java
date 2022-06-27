package com.varxyz.jy200.mod007;

public class Book {
	private String bookName;
	private int serial;
	public Book(String bookName, int serial) {
		this.bookName = bookName;
		this.serial = serial;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getSerial() {
		return Integer.toString(serial);
	}
	
}