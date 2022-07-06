package com.varxyz.jv999.service;

import java.util.List;

import com.varxyz.jv999.dao.AccountDao;
import com.varxyz.jv999.domain.Account;
import com.varxyz.jv999.domain.Customer;

public class BankServiceTest {
	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		String name = "마스";
		String ssn = "970824-1234567";
		String phone = "010-3321-3232";
		String userId = "aarkframe";
		String passwd = "1122";
		//1.신규 고객 등록
//		service.addCustomer(name, ssn, phone, userId, passwd);
//		try {
//			//2.SavingsAccount 생성
//			service.addSavingsAccount(7000, 0.4, ssn);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		3.고객 등록 확인
		Customer customer = service.getCustomerBySsn(ssn);
//		List<Customer> customer2 = service.getAllCustomers();

		System.out.println(customer);
//		System.out.println(customer2)
		
		
		//4.고객 계좌 목록 확인
//		List<Account> myList = service.getfindAccountsBySsn(ssn);
//		for ( Account account : myList ) {
//			System.out.println(account);
//		}
//		9708241234567
//		등록된 모든 계좌 조회
		List<Account> aList = service.getfindAccountsBySsn(ssn);
		for ( Account c : aList ) {
			System.out.println(c);
		}
		
		//출금하기
		service.withdrawtest("584-80-1653", 4000.0);
	}
}
