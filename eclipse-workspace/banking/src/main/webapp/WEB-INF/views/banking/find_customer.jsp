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
	<h3>회원찾기 page</h3>
	<form action="find_customer" method="post">
		<label>회원 주민번호 : </label><input type="text" name="ssn"/>
		<input type="submit" value="회원찾기"/>
	</form>
	<a href="/banking/banking/success_find_customer">회원가입</a>
</body>
</html>