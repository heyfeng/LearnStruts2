package me.caofeng.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Random;


/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.interceptor
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 19:19
 * @Version: V1.0
 */
public class SecondInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("第二个拦截器开始");
        invocation.invoke();
        System.out.println("第二个拦截结束");
        int seed = (int) (Math.random()*2);
        return "success";
    }


}
