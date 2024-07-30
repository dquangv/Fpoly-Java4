<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/find/random10" method="get">
		<table border="1">
			<thead>
				<th>ID</th>
				<th>Title</th>
				<th>Views</th>
				<th>Active</th>
			</thead>
			<tr>
				<c:forEach var="item" items="${videos}">
					<tr>
						<td>${item.id}</td>
						<td>${item.title}</td>
						<td>${item.views}</td>
						<td>${item.active}</td>
					</tr>
				</c:forEach>
			</tr>
		</table>
	</form>

</body>
</html>