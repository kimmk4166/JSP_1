<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0">
		<form action="modify.do" method="post">
			<tr>
				<td>번호</td>
				<td><input type="text" name="noticepk" readonly="readonly" value="${content_view.noticepk }"></td>
			</tr>
<%-- 			<tr>
				<td>작성자</td>
				<td><input type="text" name="admin_adminpk" size="20" value="${content_view.admin_adminpk }"></td>
			</tr> --%>
			<tr>
				<td>제목</td>
				<td><input type="text" name="noticetitle" size="50" value="${content_view.noticetitle }"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="noticetext">${content_view.noticetext }</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;<a href="list.do">목록보기</a>
				&nbsp;&nbsp;&nbsp;<a href="delete.do?noticepk=${content_view.noticepk }">삭제</a></td>
			</tr>
		</form>
	</table>
</body>
</html>