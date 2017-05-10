package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-04 23:01
 * @Version: V1.0
 */
public class HelloAction extends ActionSupport {
    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/4 22:18
     * @Description: 执行请求，返回处理结果
     */
    @Override
    public String execute() throws Exception {
        System.out.println(" process user request ");
        //表示处理成功
        return SUCCESS;
    }


}
