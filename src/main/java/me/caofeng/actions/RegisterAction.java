package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import me.caofeng.beans.User;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-09 14:33
 * @Version: V1.0
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User>{
    private User user = new User();
    private String repassword;

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("注册  ");
        return SUCCESS;
    }
}
