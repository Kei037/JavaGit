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
<h3>계좌생성</h3>
<form:form method="post" modelAttribute="account">
	<label>계좌선택</label><br>
	<form:radiobutton path="accountType" value="C"/> 예금계좌
	<form:radiobutton path="accountType" value="S"/> 저축계좌
	<br>
	<label>입금 금액</label>
	<form:input type="number" path="balance"/><br>
	<p/>
	<input type="submit" value="계좌신청"/>
</form:form>
</body>
</html>