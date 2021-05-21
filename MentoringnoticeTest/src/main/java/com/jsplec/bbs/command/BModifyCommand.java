package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String admin_adminpk=request.getParameter("admin_adminpk");
		String noticetitle=request.getParameter("noticetitle");
		String noticetext=request.getParameter("noticetext");
		String noticepk=request.getParameter("noticepk");
		
		BDao dao=new BDao();
		dao.update(admin_adminpk, noticetitle, noticetext, noticepk);
		
	}

}
