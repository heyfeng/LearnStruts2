package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 测试一个Action配置多个方法处理用户请求，一个方法对用不同的请求
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-06 0:56
 * @Version: V1.0
 */
public class MethodAction extends ActionSupport implements ServletRequestAware{

    private HttpServletRequest request;

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/6 0:57
     * @Description: 默认用来处理用户请求的方法
    */
    @Override
    public String execute() throws Exception {
        request.setAttribute("message"," default method execute() ");
        return SUCCESS;
    }


    public String getName(){
        request.setAttribute("message","getName() ,get name from server");
        return SUCCESS;
    }

    public String updateName(){
       request.setAttribute("message","updateName() ,update name ");
       return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
