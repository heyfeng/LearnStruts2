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
        </h3>
        <table border="1">
            <tr>
                <th>书名</th>
                <th>作者</th>
                <th>价格</th>
            </tr>

            <s:iterator value="books" var="book">
                <tr>
                    <th><s:property value="name"/></th>
                    <th><s:property value="author"/></th>
                    <th><s:property value="price"/></th>
                <tr>
            </s:iterator>
        </table>
    </div>


    <div>
        <h3>
            <font color="blue">过滤和投影集合</font>
        </h3
        <p>价格大于15的书</p>
        <s:iterator value="books.{?#this.price > 15}">
            <p> <s:property value="author"/>写的<s:property value="name"/> 价格为<s:property value="price"/></p>
        </s:iterator>


        <p>曹峰写的书为</p>
        <s:property value="books.{?#this.author=='曹峰'}.{name}[0]"/>
        价格
        <s:property value="books.{?#this.author=='曹峰'}.{price}[0]"/>
        元
    </div>

    <div>
        <h3>
            <font color="blue">构造map</font>
        </h3
        <s:set name="person" value="#{'1':'曹峰','2':'古龙'}"/>
        <p>键值'2'是:<s:property value="#person['2']"/>
    </div>

</body>
</html>