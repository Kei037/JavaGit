<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@page import="java.util.*"%>
<%@page import="com.arang.medici.board.dto.*"%>
<%@page import="com.arang.medici.board.cmd.*"%>
<%@page import="com.arang.medici.board.dao.*"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>스토리지</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="./design/css_default/normalize.css">
  <link rel="stylesheet" href="./design/css_default/default.css">
  <link rel="stylesheet" href="./design/css_default/header.css">
  <link rel="stylesheet" href="./design/css_board/board.css">
</head>
<body>
<center>
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
            <li><a href="/medici/service/storage_service2.jsp">Storage</a></li>
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
      <h3 class="board_top">게시판</h3>
      <div>
        <form method="post" action="searchedBbs.do">
          <fieldset>
            <legend>내 게시글 찾기</legend>
            <label>검색분류</label>
            <select class="" name="f">
              <option value="bTitle">제목</option>
              <option value="bName">작성자</option>
            </select>
            <label>검색어</label>
            <input type="text" name="q" value="${param.q}"/>
            <input type="submit" value="검색">
            <a href='<c:url value="/signup/mypage.jsp"/>'>메인페이지로</a><br>
          </fieldset>
        </form>
      </div>
      <table class="storage_list">
        <tr>
          <td>No.</td>
          <td>Name</td>
          <td>Title</td>
          <td>Date</td>
          <td>Hits</td>
        </tr>
        <c:forEach items="${list}" var="dto">
        <tr>
          	<td>${dto.bId}</td>
  			<td>${dto.bName}</td>
  			<td>
  		    <c:forEach begin ="1" end="${dto.bIndent}"></c:forEach>
  			<a href ="view.do?bId=${dto.bId}">${dto.bTitle}</a>
  			</td>
  			<td>${dto.bDate}</td>
  			<td>${dto.bHit}</td>
        </tr>
        </c:forEach>
        <tr>
  		<td colspan="5" align="right"><a href="/medici/write_view.do">글쓰기</a></td>
  	</tr>
      </table>
    </div>
  </div>
  </center>
</body>








</body>
</html>