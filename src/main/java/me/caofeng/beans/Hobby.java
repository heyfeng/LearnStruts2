package me.caofeng.beans;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.beans
 * @Description: 爱好
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 21:28
 * @Version: V1.0
 */
public class Hobby {
    private String hobby;

    public Hobby() {
        super();
    }

    public Hobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
