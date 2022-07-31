package com.varxyz.jvx330.jdbc.example5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Account;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class AccountDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AccountDao dao = context.getBean("accountDao", AccountDao.class);
		
//		addAccount(dao);
	}
	
	public static void addAccount(AccountDao dao) {
		Account a = new Account();
		
		
		dao.addAccount(a);
		System.out.println("-inserted-");
	}
	
	public static void findAccountByCustomerId(AccountDao dao) {
		System.out.println("[findAccountByCustomerId]");
		System.out.println(dao.findAccountByCustomerId(1001));
	}
}
