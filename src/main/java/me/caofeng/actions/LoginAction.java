package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;


/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-05 0:42
 * @Version: V1.0
 */
public class LoginAction  extends ActionSupport{
    /**
     * 用户名，从用户提交的表单中获取
     */
    private String name;

    /**
     * 密码，从用户提交的表单中获取，Struts2提供了自动转换功能，会转换表单中的数据
     */
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/5 0:50
     * @Description: 处理登录逻辑
    */
    @Override
    public String execute() throws Exception {
        if (null == name || null == password){
            return ERROR;
        }
        System.out.println("用户名 " +password + "密码 " + password);
        if ("admin".equals(name) && "123".equals(password)){
            System.out.println("登录成功");
            return SUCCESS;
        }else {
            System.out.println("登录失败");
            return ERROR;
        }
    }
}
