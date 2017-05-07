package me.caofeng.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.interceptor
 * @Description: 计算Action执行时间的拦截器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 17:21
 * @Version: V1.0
 */
public class TimeInterceptor extends AbstractInterceptor{

    public String intercept(ActionInvocation invocation) throws Exception {
        //记录系统当前时间
        long start = System.currentTimeMillis();
        System.out.println("Action开始 " + start );
        String result = invocation.invoke();
        //记录系统当前时间
        long end = System.currentTimeMillis();
        System.out.println("Action结束 " + end);
        //计算Action执行时间
        long time = end - start;
        System.out.println("Action执行时间 " + time + " ms ");
        return result;
    }
}
