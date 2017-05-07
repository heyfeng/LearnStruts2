package me.caofeng.beans;

import java.util.List;

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
    private List<String> activity;
    private String music ;
    private String book;
    private String province;
    private String city;
    private List<String> fruit;
    public User() {
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

    public List<String> getActivity() {
        return activity;
    }

    public void setActivity(List<String> activity) {
        this.activity = activity;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getFruit() {
        return fruit;
    }

    public void setFruit(List<String> fruit) {
        this.fruit = fruit;
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
                ", activity=" + activity +
                ", music='" + music + '\'' +
                ", book='"+book+
                '}';
    }
}
