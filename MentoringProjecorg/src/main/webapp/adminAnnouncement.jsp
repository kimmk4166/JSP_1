<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>공지사항 출력 페이지입니다.</h1>
	<br>
	<br>
	<br>
	<h3>현재 공지사항 리스트</h3>
	<table border="0">
		<tr>
			<th>글번호</th>
			<th>제목</th>

		</tr>
		<c:forEach items="${noticeList }" var="noticeDto">
			<tr>
				<td>${noticeDto.noticepk }</td>
				<td><a href="adminAnnouncementContentView.do?noticepk=${noticeDto.noticetitle}&noticetitle=${noticeDto.noticetitle}">${noticeDto.noticetitle }</a></td>
			</tr>		
		</c:forEach>
		<tr>
			<td colspan="2"><a href="adminAnnouncementInsertPage.jsp">공지사항 추가</a></td>
		</tr>
	
	</table>
	


</body>
</html>