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
<form action="user_delete" method="get">
	아이디 : <input type="text" name="userId"/>
	<br>
	<input type="submit" value="확인"/>
</form>
</body>
</html>