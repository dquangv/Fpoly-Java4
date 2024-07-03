<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./view/CSS/ASM.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="main">
		<c:forEach var="video" items="${videos}">
			<div class="video">
				<div class="poster">
					<a href="./detail?id=${video.id}"><img src="/ASM/view/images/${video.poster}" alt=""></a>
				</div>
				<div class="title">
					<a href="./detail?id=${video.id}">${video.title}</a>
				</div>
				<div class="btnGroup">
					<button style="background-color: blue;">Like</button>
					<button style="background-color: #F09658;">Share</button>
				</div>
			</div>
		</c:forEach>
		<div class="pagination">
			<button>|<</button>
			<button><<</button>
			<button>>></button>
			<button>>|</button>
		</div>
	</div>
</body>
</html>