package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import me.caofeng.beans.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 登录Action
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 12:58
 * @Version: V1.0
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {
//    private String name;
//    private String password;

//    private User user;

    private User user = new User();
    public LoginAction() {
    }

//    public LoginAction(User user) {
//        this.user = user;
//    }

//    public User getUser() {
//        return user;
//    }

//    public void setUser(User user) {
//        this.user = user;
//    }

    //    public LoginAction(String name, String password) {
//        this.name = name;
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name", user.getName());
        request.setAttribute("password", user.getPassword());
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
