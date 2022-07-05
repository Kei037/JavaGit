<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder, java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod008 : 자바빈즈\", \"UTF-8\") %>" />
		</jsp:include>
	</div>
	<div id="content-wrapper">
		<h3> 회원가입 실패</h3>
		<ul>
		<c:if test="">
			
		
		</c:if>
		
		실패사유 :
		<ul style="list-style-type:none">
<%
			@SuppressWarnings("unchecked")
			List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");
			for (String errorMsg : errorMsgs){
%>
				<li>jsp빈즈 활용<%= errorMsg %></li>
				
<%
			}
%>
		<li>EL활용 ${errorMsgs[0]}</li>
		</ul>
		
	</div>
	<div id="footer">	
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>