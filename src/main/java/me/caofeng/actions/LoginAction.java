package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import me.caofeng.util.ValidateUtil;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-09 1:18
 * @Version: V1.0
 */
public class LoginAction extends ActionSupport implements ServletRequestAware {
    private String name;
    private String password;
    private String repassword;
    private String phone;

    private HttpServletRequest request;


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

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/9 12:22
     * @Description: 默认验证，会验证所有方法
     */
    @Override
    public void validate() {

    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/9 12:51
     * @Description: 验证登录数据
    */
    public void validateLogin() {
        System.out.println("验证登录");
        if (ValidateUtil.isEmpty(name) || ValidateUtil.isEmpty(password)) {
            this.addFieldError("error", "用户名或密码错误");
        }

        //检查用户名是否包含中文
        if (ValidateUtil.isContainChinese(name)) {
            this.addFieldError("error", "用户名或密码错误");
        }

        //检查密码是否符合要求
        if (ValidateUtil.isDigit(password) || password.length() < 6) {
            this.addFieldError("error", "用户名或密码错误");
        }

        if (!("admin".equals(name) && "admin123".equals(password))) {
            this.addFieldError("error", "用户名或密码错误");
        }
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/9 12:51
     * @Description: 验证注册数据
    */
    public void validateRegister(){
        System.out.println("验证注册");
        if (ValidateUtil.isEmpty(name) || ValidateUtil.isEmpty(password)
                || ValidateUtil.isEmpty(repassword) || ValidateUtil.isEmpty(phone)) {
            System.out.println("用户名或密码或确认密码或手机号为空");
            this.addFieldError("error", "用户名或密码错误");
        }
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/9 12:23
     * @Description: 登录
     */
    public String login() {
        request.setAttribute("name", name);
        request.setAttribute("password", password);
        return SUCCESS;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/9 1:58
     * @Description: 注册
     */
    public String register() {
        System.out.println("注册");
        request.setAttribute("name", name);
        request.setAttribute("password", password);
        request.setAttribute("repassoword",repassword);
        request.setAttribute("phone",phone);
        return SUCCESS;
    }


}
