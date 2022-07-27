<%@page import="com.varxyz.banking.domain.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
<h3>My Page</h3>
${email}님<br>
<a href="/banking/banking/add_account">계좌생성하러가기</a> 
<form action="find_account" method="post">
	<input type="submit" value="내계좌 조회하기"/>
</form>
<a href="/banking/banking/find_account"></a> 
<form action="logout" method="get">
	<input type="submit" value="로그아웃"/>
</form>
</body>
</html>