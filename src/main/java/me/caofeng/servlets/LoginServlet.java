package me.caofeng.servlets;

import me.caofeng.util.ValidateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.servlets
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-09 0:10
 * @Version: V1.0
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.err.println("你觉得用GET方法处理登录逻辑真的合适吗？");
        response.sendRedirect("warming.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        //验证用户名和密码是否为空
        if (ValidateUtil.isEmpty(name) || ValidateUtil.isEmpty(password)){
            error(request,response);
        }

        System.out.println("用户名 "+name +" 密码 " + password );
        //检查用户名是否包含中文
        if (ValidateUtil.isContainChinese(name)){
            error(request,response);
        }

        //检查密码是否符合要求
        if (ValidateUtil.isDigit(password) || password.length() < 6){
            error(request,response);
        }

        if ("admin".equals(name) && "admin123".equals(password)){
            request.setAttribute("name",name);
            request.setAttribute("password",password);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            error(request,response);
        }
    }

    public void error(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("error","用户名或密码错误");
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }



}
