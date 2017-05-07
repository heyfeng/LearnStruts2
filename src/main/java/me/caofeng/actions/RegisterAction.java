package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import me.caofeng.beans.User;
import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 注册控制器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 0:12
 * @Version: V1.0
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User>{
    private User user = new User();

    @Override
    public String execute() throws Exception {
        System.out.println(user.toString());
        ServletActionContext.getRequest().getSession().setAttribute("user",user);
        return SUCCESS;
    }

    public User getModel() {
        return user;
    }
}
