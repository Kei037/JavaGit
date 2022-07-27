package com.varxyz.banking.dao;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.domain.Customer;

//RowMapper안쓰고 빈써서 여기서 파일1개로 해결한 리팩토링
public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCustomer(CustomerCommand customerCommand) {
		String sql = "INSERT INTO Customer (email, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, customerCommand.getEmail(),  customerCommand.getPasswd(),
				customerCommand.getName(), customerCommand.getSsn(), customerCommand.getPhone());
	}
	
	public List<Customer> findAllCustomer() {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	public List<Customer> findCustomerByRegDate(Date regDate) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE DATE(regDate)=?";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class), regDate);	
	}
	
	public Customer findCustomerByEmail(String email) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE email=?";
		
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), email);
	}
	
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE ssn=?";
		
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), ssn);
	}
	
	public boolean loginCustomer(String email, String passwd) {
		boolean bool = false;
		String sql = "SELECT email, passwd FROM Customer WHERE email=?";
		Customer customer = jdbcTemplate.queryForObject(sql, 
				new BeanPropertyRowMapper<Customer>(Customer.class), email);
		System.out.println("테이블의 이메일 " + customer.getEmail());
		System.out.println("CustomerDao String 값 " + email);
		System.out.println("CustomerDao " + customer.getPasswd());
		if(email.equals(customer.getEmail()) && passwd.equals(customer.getPasswd())) {
			bool = true;
			return bool;
		}
		
		return bool;
	}
	
	public long countCustomers() {
		String sql = "SELECT count(*) FROM Customer";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
	
	
}
