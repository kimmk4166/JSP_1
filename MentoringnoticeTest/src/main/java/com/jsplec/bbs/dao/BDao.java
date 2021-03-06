package com.jsplec.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.bbs.dto.BDto;

public class BDao {
	DataSource datasource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			datasource=(DataSource) context.lookup("java:comp/env/jdbc/mentoringdb");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BDto> list(){
		ArrayList<BDto> dtos=new ArrayList<BDto>();
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
		try {
			connection=datasource.getConnection();
			
			String query="select noticepk,admin_adminpk,noticetitle,noticetext,indate,outdate from notice";
			preparedStatement=connection.prepareStatement(query);
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {				
				int noticepk=resultSet.getInt("noticepk");
				int admin_adminpk=resultSet.getInt("admin_adminpk");
				String noticetitle=resultSet.getString("noticetitle");
				String noticetext=resultSet.getString("noticetext");
				Timestamp indate=resultSet.getTimestamp("indate");
				Timestamp outdate=resultSet.getTimestamp("outdate");
				
				BDto dto=new BDto(noticepk, admin_adminpk, noticetitle, noticetext, indate, outdate);
				dtos.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return dtos;
	}
	
	public void write(String admin_adminpk, String noticetitle,String noticetext) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			connection=datasource.getConnection();
			
			String query="insert into notice (admin_adminpk,noticetitle,noticetext,bDate) values (?,?,?,now())";
			preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, admin_adminpk);
			preparedStatement.setString(2, noticetitle);
			preparedStatement.setString(3, noticetext);
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public BDto contentView(String Noticepk) {
		BDto dto=null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
		try {
			connection=datasource.getConnection();
			
			String query="select * from notice where noticepk=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(Noticepk));
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int noticepk=resultSet.getInt("noticepk");
				int admin_adminpk=resultSet.getInt("admin_adminpk");
				String noticetitle=resultSet.getString("noticetitle");
				String noticetext=resultSet.getString("noticetext");
				Timestamp indate=resultSet.getTimestamp("indate");
				Timestamp outdate=resultSet.getTimestamp("outdate");
				
				
				dto=new BDto(noticepk, admin_adminpk, noticetitle, noticetext, indate, outdate);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}	
		return dto;
	}
	
	public void update(String admin_adminpk, String noticetitle,String noticetext,String noticepk) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			connection=datasource.getConnection();
			
			String query="update notice set noticetitle=?,noticetext=?,indate=now() where noticepk=?";
			preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, noticetitle);
			preparedStatement.setString(2, noticetext);
			preparedStatement.setString(3, noticepk);
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(String noticepk) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			connection=datasource.getConnection();
			
			String query="delete from notice where noticepk=?";
			preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, noticepk);
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
