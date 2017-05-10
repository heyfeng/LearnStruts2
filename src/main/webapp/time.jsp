<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<body>
<%
	Date date = new Date();
	out.println(date.toLocaleString());
%>
</body>
