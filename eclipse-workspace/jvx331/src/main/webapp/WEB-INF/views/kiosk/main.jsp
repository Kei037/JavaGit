<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/main.css'/>"/>
</head>
<body>
<a href="/jvx331/admin_page/admin_page">관리자 page</a>
<h1><a href="./main">Starbucks</a></h1>
<div class="category">
<a href="#" onclick="return false;" class="big-category">
<div>
<h3>음료(Beverage)</h3>
</div>
</a>
<a href="#" onclick="return false;" class="big-category">
<div>
<h3>음식(food)</h3>
</div>
</a>
</div>

<div class="menu-list">
<c:forEach var="findMenu" items="${findMenuList}">
<div class="menubox">
<a href="#" onclick="return false;" class="menu-cart">
<img alt="menu_img" src="/coffee_img/${findMenu.img}" style="width: 300px; height: 300px;"><br>
${findMenu.name_kor}<br>
<label>가격 : </label>${findMenu.balance}원<br>
</a>
</div>
</c:forEach>
</div>
<div class="food-list"></div>


</body>
</html>