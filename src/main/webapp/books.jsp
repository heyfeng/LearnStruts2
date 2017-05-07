<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books List</title>
</head>
<body>
<center>
<h2>Struts2 Demo 复选框</h2>
<div>
    <h3>s:checkboxlist 复选框</h3>
    <s:checkboxlist
        name="bookname"
        label="选择你喜欢的书"
        labelposition="top"
        list="{'Java程序社','Jsp程序设计','J2EE程序设计'}"/>
</div>
<div>
    <h3>s:combobox </h3>
    <s:combobox
        name="bookName"
        label="请选择书"
        maxlength="20"
        list="{'Java程序设计','JSP程序设计','J2EE企业级开发'}"
        headerKey="-1"
        headerValue="--请选择--"
        emptyOption="true"
        value="JSP程序设计"
        />
    <s:bean name="me.caofeng.service.BookService" id="books"/>
        <s:combobox
        name="bookAuthor"
        label="选择作者"
        labelposition="top"
        maxlength="20"
        list="#books.books"
        listKey="author"
        listValue="author"
        headerKey="-1"
        headerValue="--请选择--"
        emptyOption="true"
        value="JSP程序设计"
        />
</div>

</center>
</body>
</html>