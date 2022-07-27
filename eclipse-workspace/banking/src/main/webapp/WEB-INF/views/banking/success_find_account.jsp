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
<h3>현재 내 계좌목록</h3>
<c:forEach var="account" items="${accountList}">
	<li>계좌번호 : ${account.accountNum}</li>
	<li>계좌타입 : ${account.accountType}</li>
	<li>계좌잔액 : ${account.balance}</li>
	<li>계좌개설일 : ${account.regDate}</li>
===============================================
</c:forEach>
</body>
</html>