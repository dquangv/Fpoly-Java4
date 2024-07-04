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
	${message}
	<c:choose>
		<c:when test="${empty sessionScope.user}">
		Welcome you
	</c:when>
		<c:otherwise>
		Welcome ${sessionScope.user.fullname}
		<a href="./sign-out">Đăng xuất</a>
			<c:if test="${sessionScope.user.admin}">
				<a href="/fpoly/user/index">Quản trị</a>
			</c:if>
		</c:otherwise>
	</c:choose>
	<c:url var="url" value="/account" />
	<form action="${url}/sign-in" method="POST">
		Username: <input name="username"> <br> Password: <input
			name="password" type="password"><br>
		<button formaction="${url}/sign-in">Login</button>
	</form>


</body>
</html>