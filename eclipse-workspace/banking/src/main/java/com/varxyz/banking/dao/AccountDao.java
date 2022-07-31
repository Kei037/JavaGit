package com.varxyz.banking.dao;

import static java.sql.Types.*;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.varxyz.banking.domain.Account;
import com.varxyz.banking.CustomerAccountRowMapper;
import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.domain.CheckingAccount;
import com.varxyz.banking.domain.SavingsAccount;

@Repository("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
	}
	
	public void addAccount(AccountCommand accountCommand) {
		String sql = "INSERT INTO Account (customerId, accountNum, accType, balance, "
				+ " interestRate, overAmount) VALUES (?, ?, ?, ?, ?, ?)";
		SavingsAccount sa = null;
		CheckingAccount ca = null;
		Object[] args = null;
		int[] types = new int[] {BIGINT, CHAR, CHAR, DOUBLE, DOUBLE, DOUBLE};
		
		if(accountCommand instanceof SavingsAccount) {
			sa = (SavingsAccount)accountCommand;
			args = new Object[] {
					sa.getCid(), sa.getAccountNum(), String.valueOf(sa.getAccountType()),
							sa.getBalance(), sa.getInterestRate(),0.0
			};

		}else {
			ca = (CheckingAccount)accountCommand;
			args = new Object[] {
					ca.getCid(), ca.getAccountNum(), String.valueOf(ca.getAccountType()),
					ca.getBalance(), 0.0, ca.getOverdraftAmount()
			};
		}
		
		jdbcTemplate.update(sql, args, types);
	}
	
	public List<AccountCommand> findAccountBySsn(String ssn){
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate "
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.ssn = ?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(), ssn);
	}
	
	public List<AccountCommand> findAccountByEmail(String email){
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate "
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.email = ?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(), email);
	}
	
	public List<AccountCommand> getAccounts(long customerId){
		String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, "
				+ " a.balance, a.interestRate, a.overAmount, a.regDate, c.cid "
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE a.customerId = ?";
		return jdbcTemplate.query(sql, new CustomerAccountRowMapper(), customerId);
	}
	
	public void doTransfer(double money, String withdrawAccountNum, String depositAccountNum) {
		String sql = "UPDATE Account SET balance = balance - ? WHERE accountNum=?";
		String sql2 = "UPDATE Account SET balance = balance + ? WHERE accountNum=?";
		jdbcTemplate.update(sql, money, withdrawAccountNum);
		jdbcTemplate.update(sql2, money, depositAccountNum);
	}
}
