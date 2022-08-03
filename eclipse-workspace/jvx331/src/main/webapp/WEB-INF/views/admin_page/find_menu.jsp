<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/find_menu/find_menu.css'/>"/>
</head>
<body>

<h3>메뉴조회 page</h3>
<div id="wrap">
<c:forEach var="view" items="${test}">

<div class="menubox">
<label>상품대분류 : </label>${view.categoryId}<br>
<label>상품소분류 : </label>${view.sub_categoryId}<br>
<label>상품이름(한글) : </label>${view.name_kor}<br>
<label>상품이름(영어) : </label>${view.name_eng}<br>
<label>상품가격 : </label>${view.balance}<br>
<img alt="menu_img_area" src="/coffee_img/${view.img}" style="width: 300px; height: 300px;"><br>
</div>

</c:forEach>
</div>
</body>
</html>