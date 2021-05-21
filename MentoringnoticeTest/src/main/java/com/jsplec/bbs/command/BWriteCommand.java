package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BDao;

public class BWriteCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String noticetitle=request.getParameter("noticetitle");
		String noticetext=request.getParameter("noticetext");
		
		BDao dao=new BDao();
		dao.write(noticetitle, noticetext);
	}
	

}
