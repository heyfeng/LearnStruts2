package me.caofeng.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.action
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-04 13:19
 * @Version: V1.0
 */
public class HelloAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
