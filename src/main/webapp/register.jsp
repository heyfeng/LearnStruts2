<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo register</title>
</head>
<body>
    <center>
    <h2>Struts2 Demo Register</h2>
    <p>${error}<p>
    <s:form action="register.action" method="post">
        <s:textfield name="name" label="用户名"/>
        <s:password name="password" label="密码"/>
        <s:password name="repassword" label="确认密码"/>
        <s:textfield name="phone" label="手机号"/>
        <s:textfield name="email" label="邮箱"/>
        <s:submit value="注册"/>
    </s:form>
    </center>
</body>
</html>