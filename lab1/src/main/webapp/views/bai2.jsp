<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài Lab 1</title>
</head>
<body>
	<h1>Bài Lab 1</h1>
	<hr>
	<a href="bai1.jsp">Bài 1</a> || <a href="bai2.jsp">Bài 2</a>
	
	<form action="bai2" method="post">
		<h4>Nhập số a </h4>
		<input type="text" name="txta">
		<h4>Nhập số b </h4>
		<input type="text" name="txtb">
		<input type="submit">
	</form>
	
	<h2>Tổng của a và b là: ${ketqua}</h2>
	
	<a href="index.jsp">Trang chủ</a>
</body>
</html>