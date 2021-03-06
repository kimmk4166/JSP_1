package com.project.mentoring.dto;

import java.sql.Timestamp;

public class AdminAnnouncementDto {
	
	int noticepk;
	int admin_adminpk;
	String noticetitle;
	String noticetext;
	Timestamp indate;
	Timestamp outdate;

	
	public AdminAnnouncementDto() {
		
	}

	

	public AdminAnnouncementDto(int noticepk, int admin_adminpk, String noticetitle, String noticetext,
			Timestamp indate, Timestamp outdate) {
		super();
		this.noticepk = noticepk;
		this.admin_adminpk = admin_adminpk;
		this.noticetitle = noticetitle;
		this.noticetext = noticetext;
		this.indate = indate;
		this.outdate = outdate;
	}



	public int getNoticepk() {
		return noticepk;
	}



	public void setNoticepk(int noticepk) {
		this.noticepk = noticepk;
	}



	public int getAdmin_adminpk() {
		return admin_adminpk;
	}



	public void setAdmin_adminpk(int admin_adminpk) {
		this.admin_adminpk = admin_adminpk;
	}



	public String getNoticetitle() {
		return noticetitle;
	}



	public void setNoticetitle(String noticetitle) {
		this.noticetitle = noticetitle;
	}



	public String getNoticetext() {
		return noticetext;
	}



	public void setNoticetext(String noticetext) {
		this.noticetext = noticetext;
	}



	public Timestamp getInDate() {
		return indate;
	}



	public void setInDate(Timestamp indate) {
		this.indate = indate;
	}



	public Timestamp getOutDate() {
		return outdate;
	}



	public void setOutDate(Timestamp outdate) {
		this.outdate = outdate;
	}



	

	


}
