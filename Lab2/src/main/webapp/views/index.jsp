<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài Lab 2</title>
</head>
<body>
	<h1>Bài Lab 2</h1>
	<hr>
	<c:url var="home" value="/home"/>
	<a href="${home}/tam-giac">Bài 1</a> || <a href="${home}/dang-ky">Bài 2</a> || <a href="${home}/hit-counter">Bài 3</a>
	<hr>
	<jsp:include page="${view}"/>
	
</body>
</html>