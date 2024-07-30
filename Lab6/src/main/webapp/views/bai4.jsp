<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 6 Bài 4</title>
</head>
<body>
	<c:url var="home" value="/find" />
	<a href="${home}/random10">Hiển thị 10 video ngẫu nhiên</a> ||
	<a href="${home}/favoriteByYear">Tổng hợp số lượt thích từng video theo năm</a>
	<hr>
	<jsp:include page="${viewBai4}" />

</body>
</html>