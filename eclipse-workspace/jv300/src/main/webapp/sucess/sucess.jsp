<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	select {
		width:177px;
	}
</style>
</head>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value=" mod008 : Java Beans and include" />
		</jsp:include>
	</div>
	<div id="content-wrapper">
		<h3>회원가입되었습니다.</h3>
		<jsp:useBean id="user" class="com.varxyz.jv300.mod009.User" scope="request"/>
		아이디 : <jsp:getProperty property="userId" name="user"/><br>
		이름 : <jsp:getProperty property="userName" name="user"/>
		
		EL: ${user.userId}<br>
		
	</div>
	<div id="footer">	
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>