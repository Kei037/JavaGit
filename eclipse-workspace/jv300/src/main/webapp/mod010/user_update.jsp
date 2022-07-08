<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/incl/banner.jsp" %>
<br>
<form action="user_update" method="post">
	아이디 : <input type="text" name="userId"/>
	변경할 비밀번호 : <input type="password" name="passwd"/>
	<br>
	<input type="submit" value="확인"/>
</form>
</body>
</html>