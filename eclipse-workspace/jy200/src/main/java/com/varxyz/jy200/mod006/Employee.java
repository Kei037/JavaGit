package com.varxyz.jy200.mod006;

import java.util.Date;
import java.util.Objects;

import com.varxyz.jy200.mod007.Book;
import com.varxyz.jy200.mod007.Libary;

public class Employee {
	protected String name;
	protected double salary;
	public MyDate birthDate;

	public boolean equals (Object obj) {
		if ( obj instanceof Employee ) {
			Employee e = (Employee) obj;
			if (e.getName().equals(name) && e.getBirthDate().equals(birthDate) ) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;   //유비
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;   // 1000.0
	}

	
	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;    // 10, 4, 2000
	}

	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
	
	public void add() {
		int getPrice = 0;
		System.out.println(getPrice);
	}
}


//package com.varxyz.jy200.mod007;
//
//public class Libary {
//	private Book[] books = new Book[100];
//	
//	private Libary() {
//	}
//	
//	private static Libary lib = new Libary();
//	
//	public static Libary getLibary() {
//		return lib;
//	}
//
//	public static void main(String[] args) {
//		
//	}
//}
//

//package com.varxyz.jy200.mod007;
//
//public class LibaryTest extends Libary {
//	public static void main(String[] args) {
//		Libary test = new Libary();
////		test.addBook(new Book("어린왕자"));
////		test.getBook(0);
//		System.out.println(test);
//		
//	}
//
//}
