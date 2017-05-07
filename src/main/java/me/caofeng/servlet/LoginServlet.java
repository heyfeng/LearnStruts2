package me.caofeng.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.servlet
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 12:22
 * @Version: V1.0
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("name");
       String password = request.getParameter("password");
       System.out.println(" name " + name + " password " + password);
       request.setAttribute("name",name);
       request.setAttribute("password",password);
       request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
