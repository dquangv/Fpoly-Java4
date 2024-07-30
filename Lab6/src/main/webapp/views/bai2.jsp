<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 6 Bài 2</title>
</head>
<body>
	<c:url var="home" value="/find" />
	<a href="${home}/find-userID">Tìm video yêu thích theo ID người sử
		dụng</a> ||
	<a href="${home}/find-videoTitle">Tìm video yêu thích theo từ khoá
		trong title</a> ||
	<a href="${home}/find-userLikeVideo">Tìm những người sử dụng thích
		video theo ID video</a> ||
	<a href="${home}/find-favorite">Hiển thị tất cả các video được yêu
		thích hoặc không</a> ||
	<a href="${home}/favorite-count">Tổng hợp số lượt thích từng video</a>
	<hr>
	<jsp:include page="${viewBai2}" />

</body>
</html>