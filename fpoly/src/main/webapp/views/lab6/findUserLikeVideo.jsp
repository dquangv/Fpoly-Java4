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
	<form action="${url}/find-userLikeVideo" method="post">
		<input name="videoId" placeholder="Keyword?">
		<button>Search</button>
	</form>
	<table border="1">
		<thead>
			<th>ID</th>
			<th>Fullname</th>
			<th>Email</th>
			<th>Role</th>
		</thead>
		<tr>
			<c:forEach var="item" items="${users}">
				<tr>
					<td>${item.id}</td>
					<td>${item.fullname}</td>
					<td>${item.email}</td>
					<td>${item.admin}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>