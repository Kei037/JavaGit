package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.OverdraftException;

public class CheckingAccount extends Account {
	protected double overdraftAmount;  // 대출 한도액
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) {
		if (super.balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한도내에서 추가 출금을 승인
			double overdraftNeeded = amount - balance;
			if (overdraftAmount < overdraftNeeded) {
				throw new OverdraftException("에러 : 대월금 초과", balance, overdraftNeeded);
			}else {
				balance = 0.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		}else {
			// 잔고가 부족하지 않다면 현재잔고에서 출금 승인
			super.balance -= amount;
		}
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
}
