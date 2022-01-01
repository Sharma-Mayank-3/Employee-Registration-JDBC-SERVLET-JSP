<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to employee registration</title>
</head>
<body>
 <form action="<%=request.getContextPath()%>/registration" method="post">
 	Name : <input type="text" name="userName"><br>
 	Age : <input type="text" name="age"><br>
 	Address : <input type="text" name="address"><br>
 	Password : <input type="password" name="password"><br>
 	<input type="submit" name="submit">
 </form>
</body>
</html>