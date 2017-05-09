<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Struts2 Demo Login</title>
</head>
<body>
     <h2>Struts2 Demo Login</h2>
     <p>对用户名和密码进行校验,只在后端做校验
        <ul>
            <li>密码长度要大于6,</li>
            <li>密码不能全为数字</li>
            <li>用户名不能包含中文</li>
            <li>如果账户名admin,密码为admin123,则登录成功</li>
        </ul>
     </p>

     <div>
          <p>用Servlet处理登录逻辑</p>
          <p>${error}<p>
          <form action="loginServlet" method="post">
                <p>用户名: <input type="text" name="name" /></p>
                <p>密码: <input type="password" name="password" /></p>
                <p><input type="submit" value="登录">
          </form>
     </div>

     <div>
          <p>用Struts2处理登录逻辑</p>
          <s:fielderror />
          <s:form action="login.action" method="post">
                <s:textfield name="name" label="用户名"/>
                <s:password name="password" label="密码"/>
                <s:submit value="登录"/>
          </s:form>
     </div>
</body>
</html>