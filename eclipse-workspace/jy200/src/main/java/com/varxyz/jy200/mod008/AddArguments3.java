package com.varxyz.jy200.mod008;

public class AddArguments3 {
	
	public static int parseInt(String str) throws NumberFormatException {
		int num = Integer.parseInt("25");
		return num;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		for ( String arg : args ) {
			try {
				sum += Integer.parseInt(arg);
			}catch (NumberFormatException nfe) {
				System.err.println("[" + arg + "] is not an integer" + "and will not be included in the sum.");
			}
		}
		System.out.println("Sum = " + sum);

	}
}
