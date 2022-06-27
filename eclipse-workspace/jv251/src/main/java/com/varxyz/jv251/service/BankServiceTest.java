package com.varxyz.jv251.service;

import com.varxyz.jv251.domain.Customer;

public class BankServiceTest {
	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		String name = "탁동";
		String ssn = "700123-1234567";
		String phone = "010-1234-3232";
		String userId = "workframe";
		String passwd = "7777";
		//1.신규 고객 등록
//		service.addCustomer(name, ssn, phone, userId, passwd);
		try {
			//2.SavingsAccount 생성
			service.addSavingsAccount(7000, 0.4, ssn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//3.고객 등록 확인
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
	}
}
