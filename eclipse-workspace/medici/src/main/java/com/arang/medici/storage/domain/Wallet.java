package com.arang.medici.storage.domain;

public class Wallet {
	private String walletId;		// 사용자 아이디
	private double balance;			// 현재 잔액
	private double inputBalance;	// 결제한 금액
	private double resultBalance;	// 결제후 잔액
	private String sucessMsg;
	private String failMsg;
	
	public Wallet() {}

	

	public String getWalletId() {
		return walletId;
	}



	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}



	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	public double getResultBalance() {
		return resultBalance;
	}

	public void setResultBalance(double resultBalance) {
		this.resultBalance = resultBalance;
	}

	public String getSucessMsg() {
		return sucessMsg;
	}

	public void setSucessMsg(String sucessMsg) {
		this.sucessMsg = sucessMsg;
	}

	public String getFailMsg() {
		return failMsg;
	}

	public void setFailMsg(String failMsg) {
		this.failMsg = failMsg;
	}



	public double getInputBalance() {
		return inputBalance;
	}



	public void setInputBalance(double inputBalance) {
		this.inputBalance = inputBalance;
	}
	
	
}
