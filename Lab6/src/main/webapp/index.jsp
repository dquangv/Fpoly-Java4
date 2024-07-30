<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 6</title>
</head>
<body>
	<h1>Lab 6</h1>
	<hr>
	<c:url var="home" value="/views" />
	<a href="${home}/bai2">Bài 2</a> ||
	<a href="${home}/bai3">Bài 3</a> ||
	<a href="${home}/bai4">Bài 4</a>
	<hr>
	<c:if test="${not empty view}">
        <jsp:include page="${view}" />
    </c:if>

</body>
</html>