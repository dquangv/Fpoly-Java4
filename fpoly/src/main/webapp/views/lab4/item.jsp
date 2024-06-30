<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row row-cols-1 row-cols-md-3 g-3">
		<div class="col">
			<div class="card text-center">
				<h5 class="card-title">${param.name}</h5>
				<img src="../../files/1.jpg" class="card-img-top"
					alt="">
				<div class="card-body">
					<p class="card-text">${param.price}</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>