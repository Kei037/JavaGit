package com.varxyz.banking2.dao;

import static java.sql.Types.*;
import static java.sql.Types.CHAR;
import static java.sql.Types.DOUBLE;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.banking2.domain.Account;
import com.varxyz.banking2.domain.CheckingAccount;
import com.varxyz.banking2.domain.SavingAccount;


public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (customerId, accountNum, accType, balance, interestRate, overAmount)"
				+ " VALUES(?, ?, ?, ?, ?, ?)";
		SavingAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		int[] types = new int[] {BIGINT, CHAR, CHAR, DOUBLE, DOUBLE, DOUBLE};
		
		if(account instanceof SavingAccount) {
			sa = (SavingAccount)account;
			args = new Object[] {
					sa.getCustomer().getCid(), sa.getAccountNum(), String.valueOf(sa.getAccType()),
					sa.getBalance(), sa.getInterestRate(), 0.0
			};
		}else {
			ca = (CheckingAccount)account;
			args = new Object[] {
					ca.getCustomer().getCid(), ca.getAccountNum(), String.valueOf(ca.getAccType()),
					ca.getBalance(), 0.0, ca.getOverAmount()
			};
		}
			
		jdbcTemplate.update(sql, args, types);
		System.out.println("addAccount 성공");
		
	}
	
	//모든 계좌 조회
	public List<Account> getAllAccounts() {
		String sql = "SELECT aid, customerId, accountNum, accType, balance,"
				+ " interestRate, overAmount, regDate FROM Account";
		
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper());
	}
	
	//이메일로 계좌 찾기
	public List<Account> getAccounts(String email){
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, a.balance,"
				+ " a.interestRate, a.overAmount, a.regDate"
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.email=?";
		
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(), email);
	}
	
	//계좌번호로 해당계좌 잔액 조회
	public double getBalance(String accountNum) {
		String sql = "SELECT a.balance FROM Account a INNER JOIN Customer c ON"
				+ " a.customerId = c.cid WHERE a.accountNum=?";
		
		return jdbcTemplate.queryForObject(sql, double.class, accountNum);
	}
	
	//송금
	public void doTransfer(double money, String withdrawAccountNum, String depositAccountNum) {
		String sql = "UPDATE Account SET balance = balance - ? WHERE accountNum=?";
		String sql2 = "UPDATE Account SET balance = balance + ? WHERE accountNum=?";
		jdbcTemplate.update(sql, money, withdrawAccountNum);
		jdbcTemplate.update(sql2, money, depositAccountNum);
	}
	
	//이자지급
	public void saveInterest(double interestRate, String AccountNum) {
		String sql = "UPDATE Account SET balance = balance * ? WHERE accountNum=?";
		jdbcTemplate.update(sql, interestRate, AccountNum);
	}
	
	//입금
	public void doDeposit(double money, String accountNum) {
		String sql = "UPDATE Account SET balance = balance + ? WHERE accountNum=?";
		jdbcTemplate.update(sql, money, accountNum);
	}
	
	//출금
	public void doWithdraw(double money, String accountNum) {
		String sql = "UPDATE Account SET balance = balance - ? WHERE accountNum=?";
		jdbcTemplate.update(sql, money, accountNum);
	}
	
	
}
