<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
String errormsg = (String)request.getAttribute("emsg");
%>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod007 : 자바빈즈\", \"UTF-8\") %>" />
		</jsp:include>
	</div>
	<div id="content-wrapper">
		<h3> 회원가입 실패</h3>
		<jsp:useBean id="user" class="com.varxyz.jv300.mod007.User" scope="request"/>
		실패사유 : <%= errormsg %>
	</div>
	<div id="footer">	
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>