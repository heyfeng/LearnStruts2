<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 demo Login</title>
</head>
<body>
    <h2>Struts2 Demo Login</h2>
    <p>${sessionScope.tip}<p>
    <form action="login" method="post">
       <p>
           <input type="text" name="name" placeholder="输入用户名">
       </p>

        <p>
            <input type="password" name="password" placeholder="请输入密码">
        </p>

        <p>
            <input type="submit" value="登录">
        </p>

    </form>
</body>
</html>