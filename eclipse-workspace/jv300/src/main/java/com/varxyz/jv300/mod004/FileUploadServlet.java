package com.varxyz.jv300.mod004;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/mod004/file_upload.do")
@MultipartConfig(
	fileSizeThreshold = 1024 * 1024 * 2,			// 2MB		파일을 보관하였다가 저장소에 추가
	maxFileSize = 1024 * 1024 * 10,					// 10MB		파일 최대 사이즈
	maxRequestSize = 1024 * 1024 * 50)				// 50MB		multipart전체사이즈
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR = "C:/temp";
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("-----------");
		
		File saveDir = new File(SAVE_DIR);
		if(saveDir.exists()) {  //존재한다면
			saveDir.mkdir();
		}
		for(Part part : request.getParts()) {
			// c:\temp\eclipse.ini
			part.write(saveDir.getPath() + File.separator + extractFileName(part));
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3> Upload has been done successfully. </h3>");
		out.println("</body></html>");
		out.close();
		
		
		/*Enumeration<String> en = request.getHeaderNames();
		while(en.hasMoreElements()) {
			String header = en.nextElement();
			System.out.println(header + " = " + request.getHeader(header));
			
		}*/
	}
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("Content-Disposition");
		System.out.println("Content-Disposition : " + contentDisp);
		for (String s : contentDisp.split(";")) {
			if(s.contains(File.separator)) {
				return s.substring(s.lastIndexOf(File.separator) + 1).replace("\"", "");
			}else {
				return s.substring("filename=".length() + 1).replace("\"", "");
			}
		}
		return "";
	}

}
