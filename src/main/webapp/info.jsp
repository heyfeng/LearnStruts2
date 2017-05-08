<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo Register Demo</title>
</head>
<body>
<center>
    <font color="blue">你输入的信息</font>
    <p>名字 : <s:property value="name"/></p>
    <p>年龄 : <s:property value="age"/></p>
    <p>生日 : <s:property value="birthday"/></p>
    <p>X坐标 : <s:property value="point.x"/></p>
    <p>Y坐标 : <s:property value="point.y"/></p>
    <p>兴趣爱好</p>
    <s:iterator value="#request.hobby" var="item">
        <s:property />
    </s:iterator>
</center>
</body>
</html>