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
	<form action="${url}/find-userID" method="post">
		<input name="username" placeholder="Username?">
		<button>Search</button>
	</form>
	<ul>
		<li>Fullname: ${user.fullname}</li>
		<li>Email: ${user.email}</li>
	</ul>
	<table border="1">
		<thead>
			<th>ID</th>
			<th>Title</th>
			<th>Views</th>
			<th>Active</th>
		</thead>
		<tr>
			<c:forEach var="item" items="${favorites}">
				<tr>
					<td>${item.id}</td>
					<td>${item.video.title}</td>
					<td>${item.video.views}</td>
					<td>${item.video.active}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>