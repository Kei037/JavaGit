<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../design/css_header/common_header.css">
  <link rel="stylesheet" href="../design/css/style.css">
  <link rel="stylesheet" href="../design/css/default.css">
  
  <link rel="stylesheet" href="../design/board_css/write_new.css">
  
  <script type="text/javascript" src="./js/jquery.min.js"></script>
  <script type="text/javascript" src="./js/common.js"></script>
  <title>Arang</title>
</head>

<body>
<div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="../index.html">ARANG</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="../artists/artists.html">Artists</a></li>
            <li><a href="../gallerys/gallerys.html">Gallerys</a></li>
            <li><a href="../exhibitions/exhibitions.html">Exhibitions</a></li>
            <li><a href="storage.html">Storage</a></li>
            <li><a href="../notice/notice.html">Notice</a></li>
          </ul>
          <ul class="side_menu">
            <li><a href="#"><img class="top-img" src="../img/find.png"></a></li>
            <li><a href="#"><img class="top-img" src="../img/mypage.png"></a></li>
            <li><a href="#"><img class="top-img" src="../img/like.png"></a></li>
            <li><a href="#"><img class="top-img" src="../img/cart.png"></a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div class="write_wrapper">
      <h3> 작품 보관 서비스 신청 </h3>
      <table>
        <form action="storage_service2" method="post">
          <tr>
            <td>작품코드 : </td>
            <td><input type="text" name="artworkNum"></td>
          </tr>
          <tr>
            <td>작품보관소 선택 : </td>
            <td>
              <select class="" name="storageAddr">
                <option value="" selected>선택</option>
				<option value="강남 보관소">강남 보관소</option>
				<option value="종로 보관소">종로 보관소</option>
				<option value="영등포 보관소">영등포 보관소</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>보관기간 : </td>
            <td class="date_td"><input type="date" name="startPeriod">> ~ <input type="date" name="endPeriod"></td>
          </tr>
          <tr>
            <td>배송서비스 유/무</td>
            <td>
              <select class="" name="deliveryService">
				<option value="N" selected>No</option>
				<option value="Y">Yes</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>결제할 아이디</td>
            <td>
              <input type="text" name="userId" value=${userId}>
            </td>
          </tr>
          <tr>
            <td>결제금액</td>
            <td>
              <input type="number" name="balance">
            </td>
          </tr>
          <tr>
            <td><input type="submit" value="확인"></td>
          </tr>
        </form>
      </table>
    </div>
  </div>
</form>


</body>
</html>