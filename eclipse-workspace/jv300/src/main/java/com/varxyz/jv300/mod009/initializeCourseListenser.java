package com.varxyz.jv300.mod009;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class initializeCourseListenser implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("contextInitalized() method called");
		
		ServletContext context = event.getServletContext();
		InputStream is = null; //text읽을때 한줄 단위로 읽어 - 버퍼가 내장되어 있는 stream으로 - charactor로 최적화된 버퍼 스트림 - 버퍼드리더
		BufferedReader reader = null;
		List<String[]> contentList = new ArrayList<>();//탭에 대한 정보 받기(1)
		try {
			is = context.getResourceAsStream("/WEB-INF/classes/course_contents.txt"); /* classes가 resource를 인식한다. */
			reader = new BufferedReader(new InputStreamReader(is)); //InputStream을 리더로 읽어라 / 데코레이터 패턴
			String record = null;
			while((record = reader.readLine()) != null) { // 다읽어 null을 리턴
				String[] fields = record.split("\t");//탭에 대한 정보 받기(2)
				contentList.add(fields);
			}
			context.setAttribute("contentList", contentList);//탭에 대한 정보 받기(3)
			System.out.println("The course contents has been loaded");//처리가 되면 출력된다.		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
    public void contextDestroyed(ServletContextEvent event)  {
		System.out.println("contextInitialized() method called");
    }
	
	private String escapeHtml(String line) {
		if(line.length() == 0) {			
			return line;
		}
		return line.replace("<","&lt;").replace(">","&gt");
	}
	
}
