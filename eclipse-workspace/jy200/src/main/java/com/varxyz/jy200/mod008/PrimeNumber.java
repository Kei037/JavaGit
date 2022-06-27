package com.varxyz.jy200.mod008;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
	/**
	 * 약수들의 곱셈이 내가 입력한 값인지 확인해야함
	 * main에서 객체만 만들면 실행되게 해야함
	 */
	static int count;
	static String failMessage = "";
	
	public static String checkNum(int num) throws PrimeCheckException {
		
		String successMessage = "소수입니다.";
		String result = "";
//		int[] result = new int[num];
		
		// 약수
		for (int i = 2; i < num; i++) {
			if ( num % i == 0 ) {
				result += i + " ";
//				result[i] += i;
			}
		}
		
//		for ( int i = 0; i < result.length; i++ ) {
//			String ars = result[i];
//		}
		
		// 소수
		for (int i = 2; i < num; i++) {
			if ( num % i == 0 ) {
				count = i;
				failMessage = num + " 는(은) " + num + " / " + count + " = 0 으로 나누어져 소수가 아닙니다.\n" + num + "의 약수는 " + result + "입니다.";
				throw new PrimeCheckException(failMessage);
			}else if ( i == num ) {
				break;
			}
		}
		return successMessage;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        
		PrimeNumber a = new PrimeNumber();
		try {
			System.out.println(a.checkNum(inputNum));
		} catch (PrimeCheckException e) {
			System.out.println(e.getMessage());
		}

	}
}