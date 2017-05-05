package me.caofeng.actions;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 实现Action接口来实现Action
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-05 16:06
 * @Version: V1.0
 */
public class SecondAction implements Action, ServletContextAware, ServletRequestAware, ServletResponseAware {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext servletContext;

    public String execute() throws Exception {
        String message = "实现Action接口来实现 Action";
        System.out.println(message);
        request.setAttribute("message"," request message "+message);
        request.getSession().setAttribute("message"," session message" + message);
        servletContext.setAttribute("message"," applicaion message" + message);
        return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest request) {
        System.out.println("设置 HttpServletRequest");
        this.request = request;
    }

    public void setServletContext(ServletContext context) {
        System.out.println("设置 HttpServletContext");
        this.servletContext = context;
    }

    public void setServletResponse(HttpServletResponse response) {
        System.out.println("设置 HttpServletResponse");
        this.response = response;
    }
}
