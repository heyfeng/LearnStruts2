package me.caofeng.actions;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.action.Action;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 基于POJO实现Action
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-05 15:50
 * @Version: V1.0
 */
public class POJOAction {
    public POJOAction(){

    }
    public String execute() throws Exception {
        //获取ActionContext
        ActionContext  context = ActionContext.getContext();
        //在request中添加
        context.put("message"," request中的信息 基于POJO实现 Action");
        //在session 中添加一个值
        context.getSession().put("message","session中的值 基于POJO实现 Action ");
        //在Application中添加
        context.getApplication().put("message","applicatio 中的信息 基于POJO实现Action" );

        System.out.println("基于POJO实现 Action ");
        return  "success";

    }
}
