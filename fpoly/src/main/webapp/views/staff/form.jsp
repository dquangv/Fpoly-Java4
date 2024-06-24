<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thông tin nhân viên</h1>
	
	<form action="/fpoly/staff" method="post" enctype="multipart/form-data">
		<span>Họ và tên: </span>
		<input name="name"><br>
		
		<span>Hình ảnh: </span>
		<input type="file" name="photo_file"><br>
		
		<span>Ngày sinh: </span>
		<input name="birthday"><br>
		
		<span>Quốc tịch: </span>
		<select name="country">
			<option value="US">United State</option>
			<option value="VN">Việt Nam</option>
			<option value="TQ">Trung Quốc</option>
		</select><br>
		
		<span>Giới tính: </span>
		<input type="radio" name="gender" id="male" value="true">
		<label for="male">Nam</label>
		<input type="radio" name="gender" id="female" value="false">
		<label for="female">Nữ</label><br>
		
		TT hôn nhân:
		<input type="checkbox" id="married" name="married">
		<label for="married">Đã có gia đình?</label><br>
		
		<span>Sở thích: </span>
		<input type="checkbox" id="reading" name="hobbies" value="reading">
		<label for="reading">Đọc sách</label>
		<input type="checkbox" id="travel" name="hobbies" value="travel">
		<label for="travel">Du lịch</label>
		<input type="checkbox" id="music" name="hobbies" value="music">
		<label for="music">Âm nhạc</label>
		<input type="checkbox" id="other" name="hobbies" value="other">
		<label for="other">Khác</label><br>
		
		<span>Ghi chú: </span>
		<textarea rows="3" cols="30" name="note"></textarea><hr>
		
		<button>Thêm mới</button>
	</form>
</body>
</html>