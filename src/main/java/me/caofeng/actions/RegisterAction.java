package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 0:35
 * @Version: V1.0
 */
public class RegisterAction  extends ActionSupport implements ServletRequestAware{
    private String name;
    private String age;
    private String position;
    private HttpServletRequest request;
    private String result;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("注册 名字 " + name +" 年龄 " + age + " 职位 "+position);
        Map<String,String>  map = new HashMap<>();
        StrBuilder builder = new StrBuilder();
        String com = "\"";
        String c = "," ;
        String co =":";
        builder.append("{");
        builder.append(com);
        builder.append("name");
        builder.append(com);
        builder.append(co);
        builder.append(com);
        builder.append(name);
        builder.append(com);
        builder.append(c);
        builder.append(com);
        builder.append("age");
        builder.append(com);
        builder.append(co);
        builder.append(com);
        builder.append(age);
        builder.append(com);
        builder.append(c);
        builder.append(com);
        builder.append("position");
        builder.append(com);
        builder.append(co) ;
        builder.append(com);
        builder.append(position);
        builder.append(com);
        builder.append("}");
        result = builder.toString();
        System.out.println(result);
        return super.execute();

    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
