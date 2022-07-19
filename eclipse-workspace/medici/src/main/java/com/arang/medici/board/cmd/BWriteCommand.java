package com.arang.medici.board.cmd;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.arang.medici.board.dao.Bdao;

public class BWriteCommand implements BCommand{
	private static final String SAVE_DIR = "C:\\Users\\Junyoung\\Desktop\\lib";
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		File bImg = new File(SAVE_DIR);
		
		Bdao dao = new Bdao();
		dao.write(bName, bTitle, bContent);
	}
	
	
	
}
