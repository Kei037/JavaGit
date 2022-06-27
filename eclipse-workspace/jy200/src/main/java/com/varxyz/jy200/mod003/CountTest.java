package com.varxyz.jy200.mod003;

public class CountTest {
	
	public static void main(String[] args) {
		
		int result;
		result = 0;
		
		/**
		 * i % i-1 에서 나머지가 0이 나오지않으면 소수이다.
		 * 만약 0으로 나누어진다면 result에 카운트를 하지않고 다음숫자로 넘어간다.
		 * 
		 */
		for (int i = 2; i < 1001; i++) {
			for (int j = 2; j <= i ; j++) {
				if ( i == j ) {
					++result;
				}else if( i % j == 0 ) {
					break;
				}
			}
		}
		
		System.out.println(result);

	}
}