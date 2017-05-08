<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Struts2 Demo OGNL Convert</title>
</head>
<body>
<center>
    <h3><font color="blue">信息录入</font></h3>
    <s:form action="register">
        <s:textfield name="name" label="姓名"/>
        <s:textfield name="age" label="年龄"/>
        <s:textfield name="birthday" label="生日"/>
        <s:textfield name="point" label="坐标"/>
        <s:checkboxlist label="爱好" name="hobby" list="{'读书','跳舞','游泳','唱歌'}" value="{'读书','唱歌'}"/>
        <s:submit value="提交"/>
        <s:reset value="重置"/>
    </s:form>
 </center>
</body>
</html>