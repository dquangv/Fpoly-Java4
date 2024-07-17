<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart</title>
</head>
<body>
	<div class="container">
		<h1>Giỏ hàng</h1>
		<c:choose>
			<c:when test="${empty sessionScope.cart}">
				<p>Giỏ hàng hiện không có sản phẩm</p>
			</c:when>
			<c:otherwise>
				<table class="table">
					<thead>
						<tr>
							<th>Tên sản phẩm</th>
							<th>Giá</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="prod" items="${sessionScope.cart}">
							<tr>
								<td>${prod.name}</td>
								<td>$${prod.price}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:otherwise>
		</c:choose>
		<a href="${pageContext.request.contextPath}/product" class="btn btn-secondary">Tiếp tục mua sắm</a>
	</div>
</body>
</html>
