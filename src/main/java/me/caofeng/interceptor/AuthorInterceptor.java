package me.caofeng.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import javax.servlet.http.HttpSession;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.interceptor
 * @Description: 权限拦截器，如果用户已经登录，则放行，如果没有登录，则转至登录界面
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 21:40
 * @Version: V1.0
 */
public class AuthorInterceptor  extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String name  = String.valueOf(invocation.getInvocationContext().getSession().get("name"));
        if (null == name || !"admin".equals(name)){
            System.out.println("没有登录 ,用户名" + name );
            invocation.getInvocationContext().getSession().put("tip","用户名或密码错误");
            return Action.LOGIN;
        }else{
            return invocation.invoke();
        }
    }
}
