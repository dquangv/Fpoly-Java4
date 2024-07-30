<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
		<thead>
			<th>ID</th>
			<th>Favorite Count</th>
			<th>Newest Date</th>
			<th>Oldest Date</th>
		</thead>
		<tr>
			<c:forEach var="item" items="${reports}">
				<tr>
					<td>${item.group}</td>
					<td>${item.likes}</td>
					<td>${item.newest}</td>
					<td>${item.oldest}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	
</body>
</html>