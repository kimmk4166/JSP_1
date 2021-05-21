package com.project.mentoring.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.mentoring.dao.BDao;


public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String noticepk=request.getParameter("noticepk");
		
		BDao dao=new BDao();
		dao.delete(noticepk);
	}

}
