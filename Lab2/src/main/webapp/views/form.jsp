<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Đăng ký</h1>
	<form action="/Lab2/dang-ky" method="post">
		<span>Tên đăng nhập: </span>
		<input name="name"><br>
		
		<span>Mật khẩu: </span>
		<input name="password" type="password"><br>
		
		<span>Giới tính: </span>
		<input type="radio" name="gender" id="male" value="true">
		<label for="male">Nam</label>
		<input type="radio" name="gender" id="female" value="false">
		<label for="female">Nữ</label><br>
		
		<input type="checkbox" id="married" name="married">
		<label for="married">Đã có gia đình?</label><br>
		
		<span>Quốc tịch: </span>
		<select name="country">
			<option value="US">United State</option>
			<option value="VN">Việt Nam</option>
			<option value="TQ">Trung Quốc</option>
		</select><br>
		
		<span>Sở thích: </span>
		<input type="checkbox" id="reading" name="hobbies" value="Đọc sách">
		<label for="reading">Đọc sách</label>
		<input type="checkbox" id="travel" name="hobbies" value="Du lịch">
		<label for="travel">Du lịch</label>
		<input type="checkbox" id="music" name="hobbies" value="Âm nhạc">
		<label for="music">Âm nhạc</label>
		<input type="checkbox" id="other" name="hobbies" value="Khác">
		<label for="other">Khác</label><br>
		
		<span>Ghi chú: </span>
		<textarea rows="3" cols="30" name="note"></textarea><hr>
		
		<button>Đăng ký</button>
	</form>
</body>
</html>