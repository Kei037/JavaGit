<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>보관서비스 신청 성공!!!</h3>
${wallet.sucessMsg}<br>
결제 후 잔액 : ${wallet.resultBalance}<br>
결제 된 금액 : ${wallet.balance}<br>
선택한 보관장소 : ${artwork.storage}<br>
보관 예약 날짜 : ${artwork.startPeriod} ~ ${artwork.endPeriod}<br>
배송서비스 유/무 : ${artwork.dbService}

  <table width="800" cellpadding="0" cellspacing="0" border=1>
  	<!-- 제목 -->
  	<tr>
  		<td align="center" width=100>작품코드</td>
  		<td align="center" width=100>유저아이디</td>
  		<td align="center" width=350>보관장소</td>
  		<td align="center" width=100>보관기간</td>
  		<td align="center" width=100>배송 서비스 유/무</td>  		
  	</tr>
	<c:forEach var="artwork" items="${artworkList}">
  	<tr>
		<td>${artwork.artworkNum}</td>
		<td>${artwork.userId}</td>
		<td>${artwork.storage}</td>
		<td>${artwork.startPeriod} ~ ${artwork.endPeriod}</td>
		<td>${artwork.dbService}</td>
	</tr>
	</c:forEach>
	<input type="submit" value="관리"/>
  </table>
</body>
</html>