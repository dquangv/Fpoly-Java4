<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thông tin nhân viên</h1>
	<ul>
		<li>Họ và tên: <strong>${bean.name}</strong></li>
		<li>Hình ảnh: <strong>${bean.photo}</strong></li>
		<li>Ngày sinh: <strong>${bean.birthday}</strong></li>
		<li>Giới tính: <strong>${bean.gender}</strong></li>
		<li>Quốc tịch: <strong>${bean.country}</strong></li>
		<li>TT hôn nhân: <strong>${bean.married}</strong></li>
		<li>Sở thích: <strong>${hobbies}</strong></li>
		<li>Ghi chú: <strong>${bean.note}</strong></li>
		
		<img alt="" src="/fpoly/files/${bean.photo}" height="300">
	</ul>
</body>
</html>