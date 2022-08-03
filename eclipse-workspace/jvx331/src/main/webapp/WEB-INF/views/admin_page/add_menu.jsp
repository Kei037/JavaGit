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
<form:form method="post" modelAttribute="menu" enctype="multipart/form-data">
<h3>메뉴 추가 page</h3>
<strong>추가할 메뉴</strong>
<br>
<label>메뉴이름(한글) : </label><form:input path="nameKor"/>
<br>
<label>메뉴이름(영어) : </label><form:input path="nameEng"/>
<br>
<label>가격 : </label><form:input path="balance"/>원
<br>
<label>아이스 유/무 : </label>
<form:checkbox path="ice" value="true"/>
<br>
<label>메뉴 카테고리 : </label>
<form:select path="categoryId" method="post" style="width:170px; text-align:center;">
	<option value="unknown" >--선택--</option>
		<form:options itemValue="menuHost" 
						itemLabel="menuCode" 
						items="${categoryProviderList}"/>
</form:select>
<br>
<label>서브메뉴 카테고리 : </label>
<form:select path="subCategoryId" style="width:170px; text-align:center;">
	<option value="unknown" >--선택--</option>
		<form:options itemValue="subMenuHost" 
						itemLabel="subMenuCode" 
						items="${subCategoryProviderList}"/>
</form:select>
<br>
<p/>
<input type="submit" value="메뉴추가"/>
<label>메뉴 이미지 : </label>
<input type="file" name="imgFile"/>
<input type="submit" value="go">
</form:form>
</body>
</html>