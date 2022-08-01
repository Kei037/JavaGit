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
<h3>메뉴성공</h3>
<strong>추가된 메뉴</strong>
<label>이름 : </label>${menu.name}
<br>
<label>가격 : </label><${menu.balance}
<br>
<label>사이즈 종류 : </label>${menu.size}
<br>
<label>아이스 유/무 : </label>${menu.ice}
<br>
<label>메뉴 카테고리 : </label>
<form:select path="menuCategory" style="width:170px; text-align:center;">
	<option value="unknown">--선택--</option>
		<form:options itemValue="emailHost" 
						itemLabel="emailCode" 
						items="${emailProviderList}"/>
	</form:select>
<br>
</body>
</html>