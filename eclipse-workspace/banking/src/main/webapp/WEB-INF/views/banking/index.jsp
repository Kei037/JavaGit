<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
<h3>My Page</h3>
${email}님<br>
<a href="/banking/banking/transfer">계좌이체</a>, 
<a href="/banking/banking/add_account">계좌생성</a><br>
<form action="find_account" method="post">
	<input type="submit" value="내계좌 조회하기"/>
</form>
<form action="logout" method="get">
	<input type="submit" value="로그아웃"/>
</form>
</body>
</html>