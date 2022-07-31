package com.varxyz.banking2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.varxyz.banking2.command.CustomerCommand;
import com.varxyz.banking2.domain.Customer;

public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//신규회원추가
	public void addCustomer(CustomerCommand customerCommand) {
		String sql = "INSERT INTO Customer (email, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql,customerCommand.getEmail(), customerCommand.getPasswd(),
				customerCommand.getName(), customerCommand.getSsn(), customerCommand.getPhone());
	}
	
	//아이디로 가입회원 찾기
	public Customer getCustomerByUserId(String userId){
		String sql = "SELECT * FROM Customer WHERE email=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getLong("cid"),
						rs.getString("email"), rs.getString("passwd"), 
						rs.getString("name"), rs.getString("ssn"),
						rs.getString("phone"), rs.getTimestamp("regDate"));
				return customer;
			}
			
		}, userId);
	}
	
	//계좌번호로 가입회원 찾기(transfer시스템에 사용중)
	public Customer getCustomerByAccountNum(String accountNum) {
		String sql = "SELECT * FROM Customer c INNER JOIN Account a ON a.customerId = c.cid"
				+ " WHERE a.accountNum=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getLong("cid"),
						rs.getString("email"), rs.getString("passwd"), 
						rs.getString("name"), rs.getString("ssn"),
						rs.getString("phone"), rs.getTimestamp("regDate"));
				return customer;
			}
		}, accountNum);
	}
	
	//로그인 유효성 검증용
	public boolean isValidUser(String userId, String passwd) {
		String sql = "SELECT count(*) FROM Customer WHERE email=? AND passwd=?";
		boolean result = true;
		int ishere = jdbcTemplate.queryForObject(sql, Integer.class, userId, passwd);
		if(ishere == 0 ) {
			result = false; 
		}
		return result;
		
	}
}
