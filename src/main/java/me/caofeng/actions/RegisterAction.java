package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import me.caofeng.beans.Hobby;
import me.caofeng.beans.Point;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 注册Action
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 21:45
 * @Version: V1.0
 */
public class RegisterAction extends ActionSupport {
    private String name;
    private String age;
    private Date birthday;
    private Point point;
    private List hobby;

    public RegisterAction() {

    }

//    public RegisterAction(String name, String age, Date birthday, Point point, List hobby) {
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//        this.point = point;
//        this.hobby = hobby;
//    }


//    public RegisterAction(String name, String age, Date birthday, List hobby) {
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//        this.hobby = hobby;
//    }


    public RegisterAction(String name, String age, List hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("注册"+ hobby);
        return SUCCESS;
    }
}
