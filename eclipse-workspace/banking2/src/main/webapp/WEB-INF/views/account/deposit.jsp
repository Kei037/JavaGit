<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="deposit" method="post">
		<p>${userId}님</p><br>
		
		<label>계좌목록</label><select name="AccountNum">
	<c:forEach var="view" items="${accountList}">
		<option value="${view.accountNum}">${view.accountNum}</option>							
	</c:forEach>
		</select>
		<label>금액</label><input type="text" name="money" required="required"><br>			
		<input type="submit" value="확인"/>
	</form>
	
</body>
</html>