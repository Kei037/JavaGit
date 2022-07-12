<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="find_artwork" method="post">
<h3>작품 찾기</h3>
작품코드 : <input type="text" name="artworkNum" >
${artwrok.artworkNum}
${artwrok.storage}
${artwrok.dbService}
<input type="submit" value="확인">
</form>

</body>
</html>