package me.caofeng.beans;
/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.beans
 * @Description: 用户实体
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 0:13
 * @Version: V1.0
 */
public class User {
    private String name ;
    private String password;
    private String degree;
    private String gender;
    private String protocol;
    private boolean agree;

    public User() {
    }

    public User(String name, String password, String degree, String gender, String protocol, boolean agree) {
        this.name = name;
        this.password = password;
        this.degree = degree;
        this.gender = gender;
        this.protocol = protocol;
        this.agree = agree;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", degree='" + degree + '\'' +
                ", gender='" + gender + '\'' +
                ", protocol='" + protocol + '\'' +
                ", agree=" + agree +
                '}';
    }
}
