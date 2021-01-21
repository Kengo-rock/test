<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>GET通信・POST通信</title>
</head>
<body>

<h2>GET通信</h2>
<form method="get" action="TestServlet">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="送信">
</form>

<h2>POST通信</h2>
<form method="post" action="TestServlet">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="送信">
</form>

</body>
</html>