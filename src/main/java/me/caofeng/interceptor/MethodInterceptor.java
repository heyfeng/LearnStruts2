package me.caofeng.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.interceptor
 * @Description: 方法拦截器，只拦截部分方法
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 20:36
 * @Version: V1.0
 */
public class MethodInterceptor extends MethodFilterInterceptor {


    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("message"," message from interceptor " +Thread.currentThread());
        System.out.println("开始执行方法拦截器");
        String result = invocation.invoke();
        System.out.println("方法拦截器执行完毕");
        return result;
    }
}
