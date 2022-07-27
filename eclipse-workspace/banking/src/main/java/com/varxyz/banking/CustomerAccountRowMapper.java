package com.varxyz.banking;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.CheckingAccount;
import com.varxyz.banking.domain.Customer;
import com.varxyz.banking.domain.SavingsAccount;

public class CustomerAccountRowMapper implements RowMapper<AccountCommand> {

	@Override
	public AccountCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
		AccountCommand accountCommand = null;
		char accType = rs.getString("accType").charAt(0);
		if(accType == 'C') {
			accountCommand = new CheckingAccount();
			CheckingAccount ca = (CheckingAccount)accountCommand;
			ca.setOverdraftAmount(rs.getDouble("overAmount"));
		}else {
			accountCommand = new SavingsAccount();
			SavingsAccount sa = (SavingsAccount)accountCommand;
			sa.setInterestRate(rs.getDouble("interestRate"));
		}
		accountCommand.setCid(rs.getLong("cid"));
		accountCommand.setCustomer(new Customer(rs.getLong("customerId")));
		accountCommand.setAccountNum(rs.getString("accountNum"));
		accountCommand.setAccountType(accType);
		accountCommand.setBalance(rs.getDouble("balance"));
		accountCommand.setRegDate(rs.getTimestamp("regDate"));
		
		return accountCommand;
	}

}
