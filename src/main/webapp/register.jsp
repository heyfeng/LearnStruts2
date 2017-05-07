<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo Register</title>
</head>
<body >
    <center>
    <h2>注册等级表</h2>
    <s:form action="register" method="post">
        <s:textfield name="name" label="name"/>
        <s:password name="password" label="password"/>
        <s:select name="degree" label="Education" list="{'高中以下','专科','本科','研究生及以上'}"/>
        <s:radio name="gender" label="gender" list="{'男','女'}"/>
        <s:textarea name="protocol" label="protocol" value="no fuck protocol"/>
        <s:checkbox name="agree" label="agree with the protocol"/>
        <s:submit value="submit"/>
        <s:reset value="reset"/>
    </s:form>
    </center>
</body>
</html>