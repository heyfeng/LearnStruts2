<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo info </title>
</head>
<body>
    <p>name ${user.name}<p>
    <p>password ${user.password}<p>
    <p>degree  ${user.degree}<p>
    <p>gender ${user.gender}<p>
    <p>protocol ${user.protocol}<p>
    <p>agree ${user.agree}<p>
    <p>love${user.activity}</p>
    <p>music${user.music}</p>
    <p>book${user.book}</p>
    <p>address: ${user.province} - ${user.city}</p>
    <p>喜欢的水果${user.fruit}</p>
</body>
</html>