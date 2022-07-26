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
	<h3>신규계좌신청</h3>
	<form action="add_account" method="post">
		<label>회원ID</label><input type="text" name="email"/><br>
		<label>계좌종류</label>
		<select name="accountType">
          <option value="" disabled selected>계좌선택</option>
          <option value="C">예금계좌</option>
          <option value="S">저축계좌</option>
        </select><br>
		<label>금액</label><input type="number" name="balance"><br>
		<input type="submit" value="계좌생성"/>
	</form>
</body>
</html>