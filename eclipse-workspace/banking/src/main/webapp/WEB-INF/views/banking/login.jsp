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
	<h3>로그인</h3>
	<form action="login" method="post">
		<label>회원ID : </label><input type="text" name="email"/><br>
		<label>비밀번호 : </label><input type="password" name="passwd"><br>
		<input type="submit" value="로그인"/>
	</form>
	<a href="/banking/banking/add_customer">회원가입</a>
	<a href="/banking/banking/find_customer">회원찾기</a>
</body>
</html>