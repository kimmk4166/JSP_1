package com.project.mentoring.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.mentoring.dao.BDao;


public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String noticetitle=request.getParameter("noticetitle");
		String noticetext=request.getParameter("noticetext");
		String noticepk=request.getParameter("noticepk");
		
		BDao dao=new BDao();

		dao.update(noticetitle, noticetext, noticepk);
		
	}

}
