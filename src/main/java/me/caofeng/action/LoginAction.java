package me.caofeng.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import me.caofeng.beans.User;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.action
 * @Description: 登录控制器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-04 14:52
 * @Version: V1.0
 */
public class LoginAction extends ActionSupport {
    private static final long seriaVersionUID = 1l;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();
        if ("admin".equals(user.getName()) && "123".equals(user.getPassword())) {
            actionContext.put("success", "login success");
            return SUCCESS;
        } else {
            actionContext.put("error", "error username or password");
            return ERROR;
        }

    }


    public String login() {
        ActionContext actionContext = ActionContext.getContext();
        if ("admin".equals(user.getName()) && "123".equals(user.getPassword())) {
            actionContext.put("success", "登录成功 ");
            return SUCCESS;
        } else {
            actionContext.put("error", "用户名或密码错误");
            return ERROR;
        }
    }

    public String register() {
        ActionContext actionContext = ActionContext.getContext();
        if ("admin".equals(user.getName()) && "123".equals(user.getPassword())) {
            actionContext.put("success", "注册成功 ");
            return SUCCESS;
        } else {
            actionContext.put("error", "用户名或密码格式不对");
            return ERROR;
        }
    }


}
