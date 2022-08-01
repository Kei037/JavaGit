<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
<h3>계좌생성 성공!!</h3>
	<label>선택계좌 : </label>${account.accountType}
	<br>
	<label>계좌번호 : </label>${account.accountNum}
	<br>
	<label>잔액 : </label>${account.balance}
</body>
</html>