<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url var="url" value="/find" />
	<form action="${url}/find-bymonth" method="post">
		<input type="checkbox" name="month" value="01">1
		<input type="checkbox" name="month" value="02">2
		<input type="checkbox" name="month" value="03">3
		<input type="checkbox" name="month" value="04">4
		<input type="checkbox" name="month" value="05">5
		<input type="checkbox" name="month" value="06">6
		<input type="checkbox" name="month" value="07">7
		<input type="checkbox" name="month" value="08">8
		<input type="checkbox" name="month" value="09">9
		<input type="checkbox" name="month" value="10">10
		<input type="checkbox" name="month" value="11">11
		<input type="checkbox" name="month" value="12">12
		<button>Tìm</button>
		
	</form>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Views</th>
			<th>Active</th>
		</tr>
		<c:forEach var="item" items="${videos}">
		<tr>
			<td>${item.id}</td>
			<td>${item.title}</td>
			<td>${item.views}</td>
			<td>${item.active}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>