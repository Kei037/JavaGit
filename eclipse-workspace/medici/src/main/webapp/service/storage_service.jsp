<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 보관 서비스 신청</h3>
<form action="storage_service" method="post">
작품코드 : <input type="text" name="artworkNum"><br>
작품보관소 선택 : <select name="storageAddr">	
				<option value="" selected>선택</option>
				<option value="강남 보관소">강남 보관소</option>
				<option value="종로 보관소">종로 보관소</option>
				<option value="영등포 보관소">영등포 보관소</option>
			  </select><br>
보관기간 : <input type="text" name="storagePeriod"><br>
배송서비스 유/무 <select name="deliveryService">	
				<option value="N" selected>No</option>
				<option value="Y">Yes</option>
			  </select><br>
<input type="submit" value="확인"/>
</form>
</body>
</html>