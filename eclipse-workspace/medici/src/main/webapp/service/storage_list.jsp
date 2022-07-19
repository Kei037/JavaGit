<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <title>스토리지</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../design/css_default/normalize.css">
  <link rel="stylesheet" href="../design/css_default/default.css">
  <link rel="stylesheet" href="../design/css_default/header.css">
  <link rel="stylesheet" href="../design/css_board/board.css">
</head>

<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="index.html">ARANG</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="./artists/all.html">Artists</a></li>
            <li><a href="./gallerys/gallerys.html">Gallerys</a></li>
            <li><a href="./exhibitions/exhibitions.html">Exhibitions</a></li>
            <li><a href="./storage/storage.html">Storage</a></li>
            <li><a href="./notice/notice.html">Notice</a></li>
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
        <form>
          <fieldset>
            <legend>내 게시글 찾기</legend>
            <label>검색분류</label>
            <select class="" name="f">
              <option value="title">제목</option>
              <option value="writeId">작성자</option>
            </select>
            <label>검색어</label>
            <input type="text" name="q" value="">
            <input type="submit" value="검색">
            <a href="#">HOME TEST</a><br>
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
        <tr>
          <td>1</td>
          <td>김규범</td>
          <td><a href="">대구 Arario아트센터 예약</a></td>
          <td>2022-07-18</td>
          <td>2</td>
        </tr>
        <!-- <tr class="write_btn_tr">
          <td class="write_btn_td"><a href="storage_write_form_new.html">글쓰기</a></td>
        </tr> -->
        <button type="button">글쓰기</button>
      </table>
    </div>
  </div>
</body>

</html>