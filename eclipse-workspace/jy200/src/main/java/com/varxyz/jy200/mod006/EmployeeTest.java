package com.varxyz.jy200.mod006;

import java.util.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		Director e = new Director();
		e.name = "장비";
		e.salary = 1000.0;
//		e.birthDate = new MyDate();
		String detail = e.getDetails();
		System.out.println(detail);
		System.out.println(e.birthDate);
		System.out.println();
		
		Manager m = new Manager();
		m.department = "영업부";
		m.name = "관우";
		m.salary = 2000.0;
		System.out.println(m.getDetails());
		
		Employee a = new Manager();
		a.add();
		Manager b = (Manager)a;
		b.add1();
	}

}
 