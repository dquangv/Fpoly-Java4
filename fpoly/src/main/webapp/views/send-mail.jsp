<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Send Mail</h1>
	
	<form action="/fpoly/send-mail" enctype="multipart/form-data">
		<mark>${message}</mark>
		
		<span>From: </span>
		<input name="sender"><br>
		
		<span>To: </span>
		<input name="receiver"><br>
		
		<span>Subject: </span>
		<input name="subject"><br>
		
		<span>Body: </span>
		<textarea rows="3" cols="30" name="body"></textarea>
		
		<span>File: </span>
		<input type="file" name="file"><br>
		<hr>
		<button>Send</button>
	</form>
</body>
</html>