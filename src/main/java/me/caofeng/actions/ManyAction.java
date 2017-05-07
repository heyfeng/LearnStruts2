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
 * @Date: 2017-05-06 18:09
 * @Version: V1.0
 */
public class ManyAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest request;

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String execute() throws Exception {
        request.setAttribute("message", " default method execute() ");
        return SUCCESS;
    }

    public String get() {
        System.out.println("通配符调用get");
        request.setAttribute("message", "通配符调用getName() ,get name from server");
        return SUCCESS;
    }

    public String update() {
        System.out.println("通配符调用update");
        request.setAttribute("message", "通配符调用updateName() ,update name ");
        return SUCCESS;
    }

}
