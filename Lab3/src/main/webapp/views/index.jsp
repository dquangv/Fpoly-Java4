<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 3</title>
</head>
<body>
	<h1>Lab 3</h1>
	<hr>
	<c:url var="home" value="/home" />
	<a href="${home}/log-in">Bài 1</a> ||
	<a href="${home}/beanutils">Bài 2</a> ||
	<a href="${home}/upload-file">Bài 3</a> ||
	<a href="${home}/send-mail">Bài 4</a>
	<hr>
	<jsp:include page="${view}" />

</body>
</html>