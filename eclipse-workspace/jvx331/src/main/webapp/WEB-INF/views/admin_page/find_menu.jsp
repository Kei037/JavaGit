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
<jsp:include page="/WEB-INF/views/header/header.jsp"/>
<h3>메뉴조회 page</h3>
<div id="wrap">
<c:forEach var="findMenu" items="${findMenuList}">

<div class="menubox">
<p>${findMenu.mid}</p>
<label>상품대분류 : </label>${findMenu.categoryId}<br>
<label>상품소분류 : </label>${findMenu.sub_categoryId}<br>
<label>상품이름(한글) : </label>${findMenu.name_kor}<br>
<label>상품이름(영어) : </label>${findMenu.name_eng}<br>
<label>상품가격 : </label>${findMenu.balance}<br>
<img alt="menu_img" src="/coffee_img/${findMenu.img}" style="width: 300px; height: 300px;"><br>

<a href="update_menu?id=${findMenu.mid}">메뉴조회</a>
</div>

</c:forEach>
</div>
</body>
</html>