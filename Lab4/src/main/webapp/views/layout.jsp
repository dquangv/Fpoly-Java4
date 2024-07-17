<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<header class="row position-relative" style="height: 200px">
			<div class="shopping-mall position-absolute" style="bottom: 20px">
				<h1 style="padding-bottom: 0">Online shopping mall</h1>
			</div>
			<img class="pull-right position-absolute"
				style="display: inline-block; width: 450px; height: 200px; top: 0; right: 0;"
				src="${pageContext.request.contextPath}/files/header-object.png" alt="">
		</header>

		<%@include file="menu.jsp"%>

		<div class="row">
			<article class="col-sm-9">
				<jsp:include page="item.jsp"/>
			</article>
			<aside class="col-sm-3">
				<div class="poly-cart">
					<div class="card" style="max-width: 540px;">
						<div class="row g-0">
							<div class="col-md-5">
								<img src="../images/shoppingcart.gif"
									class="img-fluid rounded-start poly-cart" alt="cart">
							</div>
							<div class="col-md-7">
								<div class="card-body">
									<h5 class="card-title" style="font-weight: normal;">100
										ITEMS</h5>
									<p class="card-text">$ 56.8</p>
									<a class="card-text" href="#" style="text-decoration: none;">View
										Cart</a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="card" style="max-width: 540px;">
					<div class="panel panel-default">
						<div class="panel-body">
							<form method="post">
								<input placeholder="Keywords" class="form-control">
							</form>
						</div>
					</div>
				</div>

				<div class="card" style="max-width: 540px;">
					<div class="panel panel-default">
						<div class="panel-heading">
							<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
								fill="currentColor" class="bi bi-list-task" viewBox="0 0 16 16">
                                <path fill-rule="evenodd"
									d="M2 2.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5V3a.5.5 0 0 0-.5-.5zM3 3H2v1h1z" />
                                <path
									d="M5 3.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5M5.5 7a.5.5 0 0 0 0 1h9a.5.5 0 0 0 0-1zm0 4a.5.5 0 0 0 0 1h9a.5.5 0 0 0 0-1z" />
                                <path fill-rule="evenodd"
									d="M1.5 7a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5zM2 7h1v1H2zm0 3.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5zm1 .5H2v1h1z" />
                            </svg>
							<strong>Chủng loại</strong>
						</div>
						<div class="list-group">
							<a href="#" class="list-group-item">Điện thoại di động</a> <a
								href="#" class="list-group-item">Máy tính xách tay</a> <a
								href="#" class="list-group-item">Máy tính để bàn</a> <a href="#"
								class="list-group-item">Quạt máy</a> <a href="#"
								class="list-group-item">Tivi</a> <a href="#"
								class="list-group-item">Tủ lạnh</a>
						</div>
					</div>
				</div>

			</aside>
		</div>

	</div>

	<footer class="row">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<p>FPT Polytechnic &copy; 2017. All rights reserved.</p>
			</div>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</body>
</html>