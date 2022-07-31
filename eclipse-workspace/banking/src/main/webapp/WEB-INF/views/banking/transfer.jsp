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
${email} 님
<h3>계좌송금하기</h3>
<form action="transfer" method="post">
	<label>출금 계좌번호 : </label>
	<select name="withdrawAccNum">
		<c:forEach var="view" items="${accountList}">
			<option value="${view.accountNum}">${view.accountNum}</option>							
		</c:forEach>
	</select><br>
	<label>이체금액 : </label><input type="number" name="amount"><br>
	<label>입금 계좌번호 : </label><input type="text" name="depositAccount"><br>
	<input type="submit" value="송금"/>
</form>
<br>
<a href="/banking/banking/add_account">계좌 신청하기</a>
</body>
</html>