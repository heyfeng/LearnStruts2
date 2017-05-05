package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-05 16:15
 * @Version: V1.0
 */
public class ThirdAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        ServletContext servletContext = ServletActionContext.getServletContext();

        String message = "实现Action接口来实现 Action";
        System.out.println(message);
        request.setAttribute("message"," request message "+message);
        request.getSession().setAttribute("message"," session message" + message);
        servletContext.setAttribute("message"," applicaion message" + message);

        return SUCCESS;
    }
}
