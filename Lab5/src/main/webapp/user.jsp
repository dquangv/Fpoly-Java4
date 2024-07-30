<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
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

	<table class="table table-bordered table-striped" border="1" style="width: 100%">
		<thead>
			<td>Username</td>
			<td>Password</td>
			<td>Fullname</td>
			<td>Email</td>
			<td>Role</td>
			<td></td>
		</thead>
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

	<nav aria-label="Page navigation">
		<ul class="pagination">
			<c:forEach begin="0" end="${totalPages - 1}" var="i">
				<li class="page-item ${currentPage == i ? 'active' : ''}"><a
					class="page-link"
					href="${pageContext.request.contextPath}/user/index?page=${i}">${i + 1}</a>
				</li>
			</c:forEach>
		</ul>
	</nav>
</body>
</html>