<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>TAM GIÁC</h1>
	<form action="/Lab2/tam-giac" method="post">
		<input name="a" placeholder="Cạnh a?" value="${resultA}"><br>
		<input name="b" placeholder="Cạnh b?" value="${resultB}"><br>
		<input name="c" placeholder="Cạnh c?" value="${resultC}"><hr>
		<button formaction="/Lab2/dien-tich">Tính diện tích</button>
		<button formaction="/Lab2/chu-vi">Tính chu vi</button>
	</form>
	
	<h3>${message}</h3>
</body>
</html>