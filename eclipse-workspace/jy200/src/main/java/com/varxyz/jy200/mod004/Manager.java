package com.varxyz.jy200.mod004;

public class Manager extends Employee {
	String department;
	
	//method overriding
	@Override
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}
	
	public void add1() {
		int getPrice = 100;
		System.out.println(getPrice);
	}
}
