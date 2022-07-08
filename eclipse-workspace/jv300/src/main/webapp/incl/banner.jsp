<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="banner">
<form action="/jv300/mod009/find_user.jsp" method="post">
	<input type="submit" value="유저찾기"/>
</form>

<form action="/jv300/mod010/mypage" method="get">
	<input type="submit" value="마이페이지"/>
</form>

<form action="logout" method="get">
	<input type="submit" value="로그아웃"/>
</form>
<a href="/jv300/mod010/mypage"> 마이페이지</a><br>
</div>
