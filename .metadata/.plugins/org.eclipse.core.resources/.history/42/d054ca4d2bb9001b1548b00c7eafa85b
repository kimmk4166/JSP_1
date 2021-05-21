package com.project.mentoring.dao;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.project.mentoring.dto.AdminAnnouncementDto;
import com.project.mentoring.dto.AdminUserListDto;

import java.sql.*;
import java.util.ArrayList;

public class AdminAnnouncementDao {

	DataSource dataSource;

	public AdminAnnouncementDao() {
		
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mentoringdb");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	/* Help Page 에 notice의 list 를 
	 * 
	 *   글제목, 글내용, 작성날짜 보여주기 */
	
	public ArrayList<AdminAnnouncementDto > noticeList(){
		ArrayList<AdminAnnouncementDto> adminAnnouncementDtos = new ArrayList<AdminAnnouncementDto>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String noticeListQuery = "select noticepk, admin_adminpk, noticetitle, noticetext, indate , outdate from notice order by noticepk";
			prepareStatement = connection.prepareStatement(noticeListQuery);
			resultSet = prepareStatement.executeQuery();
			
			
			while(resultSet.next()) {
				
			int noticepk = resultSet.getInt("noticepk");
			int admin_adminpk = resultSet.getInt("admin_adminpk");
			String noticetitle = resultSet.getString("noticetitle");
			String noticetext = resultSet.getString("noticetext");
			Timestamp indate = resultSet.getTimestamp("indate");
			Timestamp outdate = resultSet.getTimestamp("outdate");
				
				AdminAnnouncementDto adminAnnouncementDto = new AdminAnnouncementDto(noticepk, admin_adminpk, noticetitle, noticetext, indate, outdate);
				adminAnnouncementDtos.add(adminAnnouncementDto);				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(prepareStatement != null) prepareStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return adminAnnouncementDtos;
	}
	
	
	public int adminAnnouncementInsert(String admin_adminpk, String noticetitle, String noticetext, String indate , String outdate){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String adminAnnouncementInsertQuery = "insert into notice (admin_adminpk, noticetitle, noticetext, indate, outdate) values (?, ?, ?, ?,now(),now() )";
			preparedStatement = connection.prepareStatement(adminAnnouncementInsertQuery);
			
			preparedStatement.setString(1, noticepk);
			preparedStatement.setString(2, admin_adminpk);
			preparedStatement.setString(3, noticetitle);
			preparedStatement.setString(4, noticetext);

			preparedStatement.executeUpdate();
			
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		return 0;
	}
	
	
//
//	public void write(String admin_adminpk, String noticetitle, String noticetext) {
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			
//			String query = "insert into notice (admin_adminpk, noticetitle, noticetext, inDate) values (?,?,?,now())";
//			preparedStatement = connection.prepareStatement(query);
//			
//			preparedStatement.setString(1, admin_adminpk);
//			preparedStatement.setString(2, noticetitle);
//			preparedStatement.setString(3, noticetext);
//
//			
//			preparedStatement.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
	
	
	
	public AdminAnnouncementDto adminAnnouncementContentView(String noticePk) {
		AdminAnnouncementDto adminAnnouncementDto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from notice where noticepk = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(noticePk));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				


				int noticepk = resultSet.getInt("noticepk");
				int admin_adminpk = resultSet.getInt("admin_adminpk");
				String noticetitle = resultSet.getString("noticetitle");
				String noticetext = resultSet.getString("noticetext");
				Timestamp indate = resultSet.getTimestamp("indate");
				Timestamp outdate = resultSet.getTimestamp("outdate");
				
				adminAnnouncementDto = new AdminAnnouncementDto(noticepk,admin_adminpk,noticetitle,noticetext,indate,outdate);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return adminAnnouncementDto;
	}



		

	
	public void modify(String noticepk, String admin_adminpk, String noticeTitle, String noticetext) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update notice set admin_adminpk = ?, noticeTitle = ?, noticetext = ?, inDate = now() where noticepk = ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, admin_adminpk);
			preparedStatement.setString(2, noticeTitle);
			preparedStatement.setString(3, noticetext);
			preparedStatement.setString(4, noticepk);
			
			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(String noticepk) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "delete from notice where noticepk = ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, noticepk);
			
			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


	
	
	
	
}//--end Line

