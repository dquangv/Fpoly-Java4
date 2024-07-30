<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 6 Bài 3</title>
</head>
<body>
	<c:url var="home" value="/find" />
	<a href="${home}/findByTitle">Tìm video yêu thích theo từ khoá
		trong title</a> ||
	<a href="${home}/findByUser">Tìm video yêu thích theo ID người sử
		dụng</a> ||
	<a href="${home}/find-inrange">Tìm những video được thích trong
		khoảng thời gian</a> ||
	<a href="${home}/find-bymonth">Tìm video yêu thích theo tháng </a>
	<hr>
	<jsp:include page="${viewBai3}" />
</body>
</html>