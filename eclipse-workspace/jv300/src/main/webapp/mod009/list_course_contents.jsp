<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style type="text/css">
.tab {
	margin-left: 40px;
}
</style>

<body>
contentList
<br>
<form action="list_course_contents.do" method="get">
<%--
<c:if test="${not empty contentList}">
	<c:forEach var="content" items="${contentList}"><br>
		<c:forEach var="content2" items="${content}">
			${content2}
		</c:forEach>
	</c:forEach>
</c:if>
--%>

<br>

<c:forEach var="textLines" items="${textLines}">
	${textLines}<br>
</c:forEach>

<input type="submit" value="확인"/>
</form>
</body>
</html>