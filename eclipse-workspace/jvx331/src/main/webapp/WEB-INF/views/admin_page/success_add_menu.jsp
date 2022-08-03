<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
<jsp:include page="/WEB-INF/views/header/header.jsp"/>
<h3>메뉴성공</h3>
<strong>추가된 메뉴</strong>
<br>
<label>이름 : </label>${menu.nameKor}, ${menu.nameEng}
<br>
<label>가격 : </label>${menu.balance}원
<br>
<label>아이스 유/무 : </label>${menu.ice}
<br>
<label>메뉴 카테고리 : </label>
${menu.categoryId}
${menu.subCategoryId}
<br>
<label>메뉴 이미지</label>
<br>
<!-- 
<img alt="menu_img_area" src="${saveDir}${imgName}.jpg" style="width: 500px; height: 500px;">
 -->
<img alt="menu_img_area" src="/coffee_img/${imgName}" style="width: 300px; height: 300px;">
</body>
</html>
