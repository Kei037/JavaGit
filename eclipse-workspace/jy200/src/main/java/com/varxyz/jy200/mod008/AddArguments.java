package com.varxyz.jy200.mod008;

public class AddArguments {
	public static void main(String[] args) {
		try {
			int sum = 0;
			for ( String arg : args ) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe) {
			System.err.println("One of the command-line " + "arguments is no an integer.");
		}
		
		// 예외의 아버지가 최상위에 있다면 다 잡아버린다.
		
		// throw등 에러를 잡는곳을 잘 설정해야함
	}
}
