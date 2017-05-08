<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 demo</title>
</head>
<body>
    <h2> Hello World</h2>
    <h2> welcome come Struts2</h2>

    <div>
        <h3>
            <font color="blue">访问Action上下文</font>
        </h3
        <p>request.name:<s:property value="#request.name"/></p>
        <p>session.name:<s:property value="#session.name"/></p>
    </div>

    <div>
        <h3>
            <font color="blue">所有数据</font>
        </h3
        <s:iterator value="books" var="book">
            <s:property value="name"/>
        </s:iterator>
    </div>


    <div>
        <h3>
            <font color="blue">过滤和投影集合</font>
        </h3

    </div>

</body>
</html>