<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starbucks</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/main.css'/>"/>
<script type="text/javascript" src="<c:url value ='/resources/js/main.js'/>"></script>

<script type="text/javascript"> 
    var bDisplay = true;
    var barverage = document.querySelector(".barverage-menu");
    var food = document.querySelector(".food-menu");
    
    function showBeverage(){
    	document.querySelector(".barverage-menu").className = "barverage-menu-on";
    	document.querySelector(".food-menu-on").className = "food-menu";
	}
    
    function showFood(){
    	document.querySelector(".food-menu").className = "food-menu-on";
    	document.querySelector(".barverage-menu-on").className = "barverage-menu";
	}
    
    function addCart(clicked_id){
    //	alert(clicked_id);
   		console.log(clicked_id);
	}
    
</script>

</head>
<body>
<a href="/jvx331/admin_page/admin_page">관리자 page</a>
<h1><a href="./main">Starbucks</a></h1>

<%-- 대분류 --%>
<div class="category">
<a href="javascript:showBeverage();" class="big-category beverage-btn" >
<div>
<h3>Beverage</h3>
</div>
</a>
<a href="javascript:showFood();" class="big-category">
<div>
<h3>Food</h3>
</div>
</a>
</div>
<%-- 음료 분류 --%>
<div class="barverage-menu-on">
<%-- 음료 소분류 --%>
<div class="category">
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>All</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Coffee</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Fappuccino</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Blended</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Tea</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>ColdBrew</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Juice</h4>
</div>
</a>
</div>
<%-- 음료 전체 리스트 --%>
<div class="berverage-list menu-List">
<c:forEach var="findMenu" items="${bigCategory101}">
<div class="menubox">
<a href="add_cart?id=${findMenu.mid}" id="${findMenu.name_eng}">
<img alt="menu_img" src="/coffee_img/${findMenu.img}" style="width: 300px; height: 300px;"><br>
<div class="order-wrap">
<div class="odrderbox1">
${findMenu.name_kor}<br>
<label>가격 : </label>${findMenu.balance}원<br>
</div>
</div>
</a>
</div>
</c:forEach>
</div>
</div>

<%-- 음식 분류 --%>
<div class="food-menu">
<%--음식 소분류 --%>
<div class="category">
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>All</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Bread</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Cake</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Sandwich</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Snack</h4>
</div>
</a>
<a href="#" onclick="return false;" class="sub-category">
<div>
<h4>Icecream</h4>
</div>
</a>
</div>
<%-- 음식 전체 리스트 --%>
<div class="food-list menu-List">
<c:forEach var="findMenu" items="${bigCategory102}">
<div class="menubox">
<form action="main" method="post">
<a href="add_cart?id=${findMenu.mid}" id="${findMenu.name_eng}">
<img alt="menu_img" src="/coffee_img/${findMenu.img}" style="width: 300px; height: 300px;"><br>
${findMenu.name_kor}<br>
<label>가격 : </label>${findMenu.balance}원<br>
</a>
</form>
</div>
</c:forEach>
</div>
</div>
<div class="cart-wrap">
<div>메뉴이미지</div>
<div>메뉴이름</div>
<div>수량</div>
<div>가격</div>
</div>


</body>
</html>