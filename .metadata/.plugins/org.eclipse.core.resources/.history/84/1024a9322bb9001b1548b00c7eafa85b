package com.project.mentoring.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.mentoring.dao.AdminAnnouncementDao;



public class AdminAnnouncementInsertCommand implements IntCommand {

	@Override
	public int execute(HttpServletRequest request, HttpServletResponse response) {
		
		String noticepk = request.getParameter("noticepk");
		String admin_adminpk = request.getParameter("admin_adminpk");
		String noticetitle = request.getParameter("noticetitle");
		String noticetext = request.getParameter("noticetext");
		String indate = request.getParameter("indate");
		String outdate = request.getParameter("outdate");

		

		AdminAnnouncementDao adminAnnouncementDao = new AdminAnnouncementDao();
		int adminAnnouncementInsertResult = adminAnnouncementDao.adminAnnouncementInsert(noticepk,admin_adminpk,noticetitle,noticetext,indate,outdate);

		return adminAnnouncementInsertResult;
	}

}
