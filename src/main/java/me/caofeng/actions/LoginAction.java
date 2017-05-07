package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 21:23
 * @Version: V1.0
 */
public class LoginAction extends ActionSupport implements ServletRequestAware{
    private String name;
    private String password;
    private HttpServletRequest request;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(" 用户名 " + name + " 密码 " + password);
        request.getSession().setAttribute("name",name);
        request.getSession().setAttribute("tip","");
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
