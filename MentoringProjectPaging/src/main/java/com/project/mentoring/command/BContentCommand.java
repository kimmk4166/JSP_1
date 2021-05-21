package com.project.mentoring.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.mentoring.dao.BDao;
import com.project.mentoring.dto.BDto;


public class BContentCommand implements BCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String noticepk=request.getParameter("noticepk");
		BDao dao=new BDao();
		BDto dto=dao.contentView(noticepk);
		
		request.setAttribute("content_view", dto);
	}

}
