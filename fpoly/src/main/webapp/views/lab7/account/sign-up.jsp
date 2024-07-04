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
	<c:url var="url" value="/account" />
	<form action="${url}/sign-up" method="POST">
		Username: <input name="id"> <br> Password: <input
			name="password" type="password"><br> Fullname: <input
			name="fullname"><br> Email: <input name="email"><br>
		<input name="admin" type="hidden" value="false"><br>
		<button formaction="${url}/sign-up">Submit</button>
	</form>
</body>
</html>