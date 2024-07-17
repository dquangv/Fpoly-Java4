<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="card text-center">
					<h5 class="card-title">${product.name}</h5>
					<img height="200px" style="width: fit-content; margin: auto"
						src="${pageContext.request.contextPath}/${product.photo}"
						class="card-img-top" alt="">
					<div class="card-body">
						<p class="card-text">$${product.price}</p>
						<a href="${pageContext.request.contextPath}/cart?action=add&id=${product.id}" class="btn btn-primary">Thêm vào giỏ hàng</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
