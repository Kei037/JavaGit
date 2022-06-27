package com.varxyz.jy200.mod007;

public class Airplane implements Flyer, Vehicle {
	
	public void fly() {
		System.out.println("비행기 : 날기");
	}

	public void fakeOff() {
		System.out.println("비행기 : 이륙히기");
	}

	public void land() {
		System.out.println("비행기 : 착륙하기");
	}

}