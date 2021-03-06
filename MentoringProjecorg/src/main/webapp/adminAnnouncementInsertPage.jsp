<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 추가 페이지 </title>
</head>
<body>
	
	<c:choose>
		<c:when test="${AnnouncementInsertResult == 1 }">
			<script>
		
			alert("등록 성공!");
			
			</script>	
		</c:when>
		<c:when test="${AnnouncementInsertResult == 0}">
			<script>
		
			alert("등록 실패!");
			
			</script>	
		</c:when>
	</c:choose>
	 

	<h2>공지사항 추가 페이지 입니다.</h2>
	<form action="adminAnnouncementInsert.do" method="post">
		<table>
			<tr>
				<td>글번호</td>
				<td><input type="text" name="noticepk" size=10 readonly="readonly"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="admin_adminpk" size=10 readonly="readonly"></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><input type="text" name="indate" size=10 readonly="readonly"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="noticetitle" size=58></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="20" cols="50" name="noticetext"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록하기"></td>
			</tr>
		
		</table>
	</form>
	<form action="adminAnnouncementListPage.do" method="post">
		<input type="submit" value="목록보기">
	</form>
</body>
</html>