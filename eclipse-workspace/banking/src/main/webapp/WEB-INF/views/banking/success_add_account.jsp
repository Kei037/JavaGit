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
	<h3>계좌신청 정보</h3>
	<!-- <label>회원ID : </label>${account.customer.email}<br> -->
	<label>계좌종류 : </label>${accountCommand.accountType}<br>
	<label>초기입금금액 : </label>${accountCommand.balance}
</body>
</html>