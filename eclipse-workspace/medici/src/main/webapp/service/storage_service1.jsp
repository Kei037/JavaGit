<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>   
<!DOCTYPE html>
<html lang="ko">

<head>
  <title>스토리지</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../design/css_default/normalize.css">
  <link rel="stylesheet" href="../design/css_default/default.css">
  <link rel="stylesheet" href="../design/css_default/header.css">
  <link rel="stylesheet" href="../design/css_storage_service1/style.css">
</head>

<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="/medici/signup/mypage.jsp">ARANG</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="/medici/page/artists_all.jsp">Artists</a></li>
            <li><a href="/medici/list.do">Gallerys</a></li>
            <li><a href="/medici/list.do">Exhibitions</a></li>
            <li><a href="/medici/service/storage_service1.jsp">Storage</a></li>
            <li><a href="/medici/list.do">Notice</a></li>
          </ul>
          <ul class="side_menu">
            <li><a href="./find/find.html"><img src="../design/img/icon/find.png" alt="find"></a></li>
            <li><a href="./mypage/mypage.html"><img src="../design/img/icon/mypage.png" alt="mypage"></a></li>
            <li><a href="./like/like.html"><img src="../design/img/icon/like.png" alt="like"></a></li>
            <li><a href="./cart/cart.html"><img src="../design/img/icon/cart.png" alt="cart"></a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div class="board_wrapper">
      <h3 class="board_top">My Storage</h3>
      <div>
        <form>
          <fieldset>
            <div class="field_inner">
              <label>검색어</label>
              <input type="text">
              <button type="button">검색</button>
              <button type="button" onclick="location.href='/medici/service/storage_service2.jsp'">작품보관신청</button>
            </div>
          </fieldset>
        </form>
      </div>
      <table class="storage_list">
        <tr>
          <td>No.</td>
          <td>작품코드</td>
          <td>지역</td>
          <td>보관소</td>
          <td>일정</td>
          <td>배송</td>
          <td>결제금액</td>
        </tr>
        <form action="storage_service1" method="post">
        <c:forEach var="artwork" items="${artworkList}">
  		<tr>
  		<td>1.</td>
		<td>${artwork.artworkNum}</td>
		<td>대구(임시)</td>
		<td>${artwork.storage}</td>
		<td>${artwork.startPeriod} ~ ${artwork.endPeriod}</td>
		<td>${artwork.dbService}</td>
		</c:forEach>
        <c:forEach var="wallet" items="${wallet}">
		<td>${wallet.balance}</td>
		</c:forEach>
		</tr>
		<input type="submit" value="확인"/>
		</form>
      </table>
    </div>
  </div>
</body>

</html>