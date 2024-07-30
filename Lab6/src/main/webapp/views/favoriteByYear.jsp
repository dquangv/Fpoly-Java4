<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./favoriteByYear" method="post">
		<select name="year">
			<option value="2022">2022
			<option value="2023">2023
			<option value="2024">2024
		</select>
		<button>Submit</button>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>Favorite Count</th>
				<th>Newest Date</th>
				<th>Oldest Date</th>
			</tr>
			<c:forEach var="item" items="${reports}">
				<tr>
					<td>${item.group}</td>
					<td>${item.likes}</td>
					<td>${item.newest}</td>
					<td>${item.oldest}</td>
				</tr>
			</c:forEach>

		</table>
	</form>
</body>
</html>