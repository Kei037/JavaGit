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
<h3>작품 찾기</h3>
<form action="find_artwork" method="post">
	<c:forEach var="artwork" items="${artworkList}">
		작품코드	: ${artwork.artworkNum}<br>
		아이디	: ${artwork.userId}<br>
		보관장소	: ${artwork.storage}<br>
		보관기간	: ${artwork.storagePeiod}<br>
		배송서비스	: ${artwork.dbService}<br>
		<p/>
	</c:forEach>
<input type="submit" value="확인"/>
</form>
</body>
</html>