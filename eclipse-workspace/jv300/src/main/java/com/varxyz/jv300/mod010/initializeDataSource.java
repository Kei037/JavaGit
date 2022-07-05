package com.varxyz.jv300.mod010;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class initializeDataSource implements ServletContextListener {
	private static final String JDBC_URL;
	private static final String JDBC_USER;
	private static final String JDBC_PASSWD;
	
	static {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName(props.getProperty("JDBC_DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JDBC_URL = props.getProperty("JDBC_URL");
		JDBC_USER = props.getProperty("JDBC_USER");
		JDBC_PASSWD = props.getProperty("JDBC_PASSWD");
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWD);
	}
	
	@Override
    public void contextInitialized(ServletContextEvent event)  {
    	System.out.println("contextInitialized() method called");
        
        ServletContext context = event.getServletContext();
        InputStream is = null;
        BufferedReader reader = null;
        List<String[]> contentList = new ArrayList<>();
        try {
        	is = context.getResourceAsStream("/WEB-INF/classes/jdbc.properties");
        	reader = new BufferedReader(new InputStreamReader(is));
        	String record = null;
        	while((record = reader.readLine()) != null) {
        		String[] fields = record.split("\t");
        		contentList.add(fields);
        	}
        	
        	context.setAttribute("contentList", contentList);
        	context.log("The course contents has been loaded");
        	System.out.println("The course contents has been loaded");
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }

	@Override
    public void contextDestroyed(ServletContextEvent event)  { 
		System.out.println("contextInitialized() method called");
    }
	
}
