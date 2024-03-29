package com.varxyz.jvx330.jdbc.example2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class CustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		findAllCustomers(dao);
		findCustomerByRegDate(dao);
		findCustomerByEmail(dao);
		countCustomers(dao);
		context.close();
		
	}
	
	public static void findAllCustomers(CustomerDao dao) {
		System.out.println("=====================================");
		System.out.println("[findAllCustomers()]");
		dao.findAllCustomer().forEach(c -> System.out.println(c));		
	}
	
	public static void findCustomerByRegDate(CustomerDao dao) {
		System.out.println("=====================================");
		System.out.println("ByRegDate");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = null;
		try {
			//여기 원하는 날짜로 바꾸면 됨
			currentDate = format.parse(format.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<Customer> list = dao.findCustomerByRegDate(currentDate);
		for(Customer customer : list) {
			System.out.println(customer);
		}
	}
	
	public static void findCustomerByEmail(CustomerDao dao) {
		System.out.println("=====================================");
		System.out.println("findCustomerByEmail");
		dao.findCustomerByEmail("qja1@java.com");
		System.out.println(dao.findCustomerByEmail("qja1@java.com"));
	}
	
	public static void countCustomers(CustomerDao dao) {
		System.out.println("=====================================");
		System.out.println("Count" + dao.countCustomers());		
	}
	
	
}
