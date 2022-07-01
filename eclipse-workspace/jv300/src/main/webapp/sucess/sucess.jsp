<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String userId = (String)request.getAttribute("userId");
	String passwd = (String)request.getAttribute("passwd");
	String userName = (String)request.getAttribute("userName");
	String ssn = (String)request.getAttribute("ssn");
	String email1 = (String)request.getAttribute("email1");
	String email2 = (String)request.getAttribute("email2");
	String addr1 = (String)request.getAttribute("addr1");
	String addr2 = (String)request.getAttribute("addr2");
%>
<h3> 회원가입 정보 </h3>
<section>
	<p>아이디<br><%= userId %></p>
	<p>비밀번호<br><%= passwd %></p>
	<p>이름<br><%= userName %></p>
	<p>생년월일<br><%= ssn %></p>
	<p>이메일<br><%= email1 %>@<%= email2 %></p>
</section>
</body>
</html>