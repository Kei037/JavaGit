package com.varxyz.jvx331.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.varxyz.jvx331.command.FindMenuItemCommand;
import com.varxyz.jvx331.command.MenuItemCommand;

@Repository("menuItemDao")
public class MenuItemDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public MenuItemDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addMenuItem(MenuItemCommand menuItemCommand) {
		String sql = "INSERT INTO MenuItem (sub_categoryId, name_kor, name_eng, "
				+ "balance, ice, img) VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, menuItemCommand.getSubCategoryId(), 
				menuItemCommand.getNameKor(), menuItemCommand.getNameEng(),
				menuItemCommand.getBalance(), menuItemCommand.isIce(),
				menuItemCommand.getImg());
	}
	
	public List<FindMenuItemCommand> allFindMenu() {
		String sql = "SELECT * FROM MenuItem LEFT JOIN Sub_Category "
				+ " ON MenuItem.sub_categoryId = Sub_Category.sid JOIN Category "
				+ " ON Sub_Category.categoryId = Category.cid";
		
		return jdbcTemplate.query(sql, new RowMapper<FindMenuItemCommand>() {
			
			public FindMenuItemCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				FindMenuItemCommand findMenuItemCommand = new FindMenuItemCommand(rs.getLong("mid"),
						rs.getLong("sub_categoryId"), rs.getString("name_kor"), 
						rs.getString("name_eng"), rs.getDouble("balance"), 
						rs.getBoolean("ice"), rs.getString("img"), 
						rs.getTimestamp("regDate"), rs.getLong("sid"), 
						rs.getLong("categoryId"), rs.getString("sub_name"), 
						rs.getLong("cid"), rs.getString("name"));
				return findMenuItemCommand;
			}
		});
	}
	
	public FindMenuItemCommand findMenu(long id) {
		String sql = "SELECT * FROM MenuItem LEFT JOIN Sub_Category "
				+ " ON MenuItem.sub_categoryId = Sub_Category.sid JOIN Category "
				+ " ON Sub_Category.categoryId = Category.cid WHERE mid = ?";
		
		return jdbcTemplate.queryForObject(sql, new RowMapper<FindMenuItemCommand>() {
			
			public FindMenuItemCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				FindMenuItemCommand findMenuItemCommand = new FindMenuItemCommand(rs.getLong("mid"),
						rs.getLong("sub_categoryId"), rs.getString("name_kor"), 
						rs.getString("name_eng"), rs.getDouble("balance"), 
						rs.getBoolean("ice"), rs.getString("img"), 
						rs.getTimestamp("regDate"), rs.getLong("sid"), 
						rs.getLong("categoryId"), rs.getString("sub_name"), 
						rs.getLong("cid"), rs.getString("name"));
				return findMenuItemCommand;
			}
		}, id);
	}
	
	
	public void updateMenuItem(MenuItemCommand menuItemCommand, long id) {
		String sql = "UPDATE MenuItem SET sub_categoryId = ?, name_kor = ?, "
				+ "name_eng = ?, balance = ?, ice = ?, img = ? WHERE mid = ?";
		jdbcTemplate.update(sql, menuItemCommand.getSubCategoryId(), 
				menuItemCommand.getNameKor(), menuItemCommand.getNameEng(),
				menuItemCommand.getBalance(), menuItemCommand.isIce(),
				menuItemCommand.getImg(), id);
	}
	
	
	public void dropMenuItem(long id) {
		String sql = "DELETE FROM MenuItem WHERE mid=?";
		jdbcTemplate.update(sql, id);
	}
	
	// 카테고리별 select 만들기
	public List<FindMenuItemCommand> findMenuByCategory(long cid) {
		String sql = "SELECT * FROM MenuItem LEFT JOIN Sub_Category "
				+ " ON MenuItem.sub_categoryId = Sub_Category.sid JOIN Category "
				+ " ON Sub_Category.categoryId = Category.cid WHERE cid = ?";
		
		return jdbcTemplate.query(sql, new RowMapper<FindMenuItemCommand>() {
			
			public FindMenuItemCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				FindMenuItemCommand findMenuItemCommand = new FindMenuItemCommand(rs.getLong("mid"),
						rs.getLong("sub_categoryId"), rs.getString("name_kor"), 
						rs.getString("name_eng"), rs.getDouble("balance"), 
						rs.getBoolean("ice"), rs.getString("img"), 
						rs.getTimestamp("regDate"), rs.getLong("sid"), 
						rs.getLong("categoryId"), rs.getString("sub_name"), 
						rs.getLong("cid"), rs.getString("name"));
				return findMenuItemCommand;
			}
		},cid);
	}
	
	public List<FindMenuItemCommand> findMenuBySubCategory(long sid) {
		String sql = "SELECT * FROM MenuItem LEFT JOIN Sub_Category "
				+ " ON MenuItem.sub_categoryId = Sub_Category.sid JOIN Category "
				+ " ON Sub_Category.categoryId = Category.cid WHERE sid = ?";
		
		return jdbcTemplate.query(sql, new RowMapper<FindMenuItemCommand>() {
			
			public FindMenuItemCommand mapRow(ResultSet rs, int rowNum) throws SQLException {
				FindMenuItemCommand findMenuItemCommand = new FindMenuItemCommand(rs.getLong("mid"),
						rs.getLong("sub_categoryId"), rs.getString("name_kor"), 
						rs.getString("name_eng"), rs.getDouble("balance"), 
						rs.getBoolean("ice"), rs.getString("img"), 
						rs.getTimestamp("regDate"), rs.getLong("sid"), 
						rs.getLong("categoryId"), rs.getString("sub_name"), 
						rs.getLong("cid"), rs.getString("name"));
				return findMenuItemCommand;
			}
		},sid);
	}
	
	
}

