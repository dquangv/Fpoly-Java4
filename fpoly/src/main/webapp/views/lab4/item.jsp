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
	<div class="row row-cols-1 row-cols-md-3 g-3">
		<c:forEach var="prod" items="${requestScope.products}">
			<div class="col">
				<div class="card text-center">
					<h5 class="card-title">${prod.name}</h5>
					<img height="200px" style="width: fit-content; margin: auto" src="${pageContext.request.contextPath}/${prod.photo}" class="card-img-top" alt="">
					<div class="card-body">
						<p class="card-text">${prod.price}</p>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>