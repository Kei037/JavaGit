package com.varxyz.jy200.mod007;

public class Bird implements Flyer {
	
	public void fly() {
		System.out.println("새 : 날기");
	}

	public void fakeOff() {
		System.out.println("새 : 이륙히기");
	}

	public void land() {
		System.out.println("새 : 착륙하기");
	}

}
