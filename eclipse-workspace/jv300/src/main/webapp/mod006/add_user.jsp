<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add_user.do" method="post">
	<h2>회원가입</h2>
	<div class='signup'>
	<p>회원아이디<br><input type="text" name="userId"/></p>
	<p>비밀번호<br><input type="password" name="passwd"/></p>
	<p>이름<br><input type="text" name="userName"/></p>
	<p>주민번호<br><input type="text" name="ssn"/></p>
	<p>이메일<br><input type="text" name="email1"/>@
	<select name="email2">	
		<option value="" selected>선택</option>
		<option value="google">gmail.com</option>
		<option value="naver">naver.com</option>
		<option value="daum">daum.net</option>
	</select></p>
	<br>
	<p>관심분야<input type="checkbox" name="concerns" value="Java"/>Java
	<input type="checkbox" name="concerns" value="Servlet/JSP"/>Servlet/JSP
	<input type="checkbox" name="concerns" value="EJB"/>EJB
	<input type="checkbox" name="concerns" value="Android"/>Android
	<input type="checkbox" name="concerns" value="Spring"/>Spring
	</p>
	</div>
	<input type="submit" value="확인"/>
</form>
</body>
</html>