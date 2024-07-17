<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send mail</title>
</head>
<body>
	<h1>Send Mail</h1>
	
	<form method="post" action="/Lab3/send-mail" enctype="multipart/form-data">
		<mark>${message}</mark><br>
		
		<span>From: </span>
		<input name="sender" value="quangvdps36680@fpt.edu.vn"><br>
		
		<span>To: </span>
		<input name="toReceiver"><br>
		
		<span>CC: </span>
		<input name="ccReceiver"><br>
		
		<span>BCC: </span>
		<input name="bccReceiver"><br>
		
		<span>Subject: </span>
		<input name="subject"><br>
		
		<span>Body: </span>
		<textarea rows="3" cols="30" name="body"></textarea><br>
		
		<span>File: </span>
		<input type="file" name="file"><br>
		<hr>
		<button>Send</button>
	</form>
</body>
</html>