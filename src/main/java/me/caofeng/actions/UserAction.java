package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import me.caofeng.beans.User;
import me.caofeng.service.UserService;
import me.caofeng.service.UserServiceApi;

import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 处理用户信息请求
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 10:39
 * @Version: V1.0
 */
public class UserAction extends ActionSupport{
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String users(){
        UserServiceApi userServiceApi = new UserService();
        users = userServiceApi.getAllUser();
        return "users";
    }


}
