package me.caofeng.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.action
 * @Description: 获取Servlet Api
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-04 18:42
 * @Version: V1.0
 */
public class MessageAction extends ActionSupport implements ServletRequestAware{

    private HttpServletRequest request;

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String execute() throws Exception {
        request.setAttribute("message"," 通过 ServletRequestAware 访问Servlet Api");
        return super.execute();
    }
}
