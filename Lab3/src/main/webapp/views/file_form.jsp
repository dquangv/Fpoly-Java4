<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload</h1>
	
	<form action="/Lab3/upload" method="post" enctype="multipart/form-data">
		<span>Hình ảnh: </span>
		<input type="file" name="photo_file"><br>
		
		<span>Tài liệu: </span>
		<input type="file" name="doc_file"><br>
		<hr>
		<button>Upload</button>
	</form>
</body>
</html>