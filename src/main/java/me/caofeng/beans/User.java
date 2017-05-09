package me.caofeng.beans;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.beans
 * @Description: 用户信息
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-09 14:31
 * @Version: V1.0
 */
public class User {
    private String name;
    private String password;
    private String phone;
    private String email;

    public User() {

    }

    public User(String name, String password,String phone, String email) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
