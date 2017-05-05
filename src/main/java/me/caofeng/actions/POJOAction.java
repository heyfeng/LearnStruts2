package me.caofeng.actions;


import com.opensymphony.xwork2.ActionSupport;

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
        System.out.println("基于POJO实现 Action ");
        return  "success";

    }
}
