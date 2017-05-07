package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 0:30
 * @Version: V1.0
 */
public class DefaultAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("默认Action");
        return SUCCESS;
    }
}
