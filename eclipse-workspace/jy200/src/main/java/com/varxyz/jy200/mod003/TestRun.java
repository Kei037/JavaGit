package com.varxyz.jy200.mod003;

public class TestRun {
	
	public static void main (String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i * j);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
