<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../design/css_login/normalize.css">
<link rel="stylesheet" href="../design/css_login/default.css">
<link rel="stylesheet" href="../design/css_login/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
            <li><a href="../artists/all.html">Artists</a></li>
            <li><a href="../gallerys/gallerys.html">Gallerys</a></li>
            <li><a href="../exhibitions/exhibitions.html">Exhibitions</a></li>
            <li><a href="../storage/storage.html">Storage</a></li>
            <li><a href="../notice/notice.html">Notice</a></li>
          </ul>
          <ul class="side_menu">
            <li><a href="./find/find.html"><img src="../design/img/icon/find.png" alt="find"></a></li>
            <li><a href="./mypage/mypage.html"><img src="../design/img/icon/mypage.png" alt="mypage"></a></li>
            <li><a href="./like/like.html"><img src="../design/img/icon/like.png" alt="like"></a></li>
            <li><a href="./cart/cart.html"><img src="../design/img/icon/cart.png" alt="cart"></a></li>
            <li><a href="login">login</a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div id="login_wrap">
      <div class="title">
        <h1>ARANG 로그인</h1>
      </div>
      <form action="login" method="post">
        <table class="table_a">
          <tr>
            <td>
              <input type="text" class="middle" placeholder="이메일(아이디)" name="userId">
            </td>
          </tr>
          <tr>
            <td>
              <input type="password" class="middle" placeholder="비밀번호" name="passwd">
            </td>
          </tr>
        </table>
        <div class="button-group">
          <button class="gbtn normal">로그인</button>
          <button class="gbtn normal gray">취소</button>                         
        </div>
        <div class="join">
          <p>아직 회원이 아니신가요?&nbsp;&nbsp;</p>
          <a href='<c:url value="/signup/add_user_db.jsp"/>'><strong>회원가입<strong></a>
          <p>비회원으로 보겠습니다 ->&nbsp;&nbsp;</p>
          <a href='<c:url value="/signup/mypage.jsp"/>'>메인으로</a>
        </div>
      </form>
    </div>
  </div>
</body>
</html>