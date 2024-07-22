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
	<!-- Thông báo -->
	${message}
	<c:url var="url" value="/user" />
	<!-- Form -->
	<form action="${url}/index" method="post">
		<input value="${form.id}" name="id" placeholder="Username?"><br>
		<input value="${form.password}" name="password"
			placeholder="Password?" type="password"><br> <input
			value="${form.fullname}" name="fullname" placeholder="Fullname?"><br>
		<input value="${form.email}" name="email" placeholder="Email?"><br>
		<input ${form.admin?'checked':''} name="admin" type="radio"
			value="true">Admin <input ${form.admin?'':'checked'}
			name="admin" type="radio" value="false">User<br>
		<hr>
		<button formaction="${url}/create" name="insert">Create</button>
		<button formaction="${url}/update" name="update">Update</button>
		<button formaction="${url}/delete" name="delete">Delete</button>
		<a href="${url}/index" name="reset">Reset</a>
	</form>

	<table border="1" style="width: 100%">
		<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.id}</td>
				<td>${item.password}</td>
				<td>${item.fullname}</td>
				<td>${item.email}</td>
				<td>${item.admin?'Admin':'User'}</td>
				<td><a href="${url}/edit/${item.id}">Edit</a></td>
				<!--<td><a href="${url}/delete/${item.id}">Delete</a></td>-->
			</tr>
		</c:forEach>
	</table>
</body>
</html>