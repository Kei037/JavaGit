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
<form action="add_cart" method="post">
<h3>장바구니 담기</h3>
<img alt="menu_img" src="/coffee_img/${menuItem.img}" style="width: 300px; height: 300px;">
<br>
${menuItem.name_kor}
<br>
<label>가격 : </label>${menuItem.balance}
<br>
<label>수량 : </label><input type="number" name="amount"/>
<br>
<label>테이크아웃 여부 : </label><input name="takeout" type="checkbox"/>
<br>
<input type="submit" value="장바구니 담기"/>
</form>
</body>
</html>