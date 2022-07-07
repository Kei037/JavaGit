<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>유저리스트</h3>
<form action="find_user.do" method="post">
	

	<c:forEach var="user" items="${userList}">
		${user}<br>
	</c:forEach>
	<input type="submit" value="확인"/>
</form>
</body>
</html>