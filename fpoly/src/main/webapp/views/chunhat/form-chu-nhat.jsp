<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tính chu vi và diện tích hình chữ nhật</title>
</head>
<body>
	<h1>THÔNG TIN HÌNH CHỮ NHẬT</h1>
	
	<form action="chunhat.php" method="post">
		<div class="chieurong" style="margin-bottom: 10px;">
			<span>Chiều rộng: </span>
			<input name="chieurong">
		</div>
		<div class="chieudai" style="margin-bottom: 10px;">
			<span>Chiều dài: </span>
			<input name="chieudai">
		</div>
		
		<button>Submit</button>
	</form>
</body>
</html>