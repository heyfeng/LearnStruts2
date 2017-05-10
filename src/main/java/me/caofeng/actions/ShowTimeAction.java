package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 显示时间
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-10 21:17
 * @Version: V1.0
 */
public class ShowTimeAction extends ActionSupport implements SessionAware{
    private Map session;
    private String message;

    public Map getSession() {
        return session;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(" 修改时间 ");
        long currentTime = System.currentTimeMillis();
        Long startTime = (Long) session.get("startTime");
        if ( null == startTime){
            startTime = currentTime;
            session.put("startTime",startTime);
        }
        long usedTime = (currentTime - startTime)/1000/60;
        if (usedTime > 60 ){
            this.setMessage("您已经访问系统: " + usedTime + " 分钟，请注意休息");
        }else if (usedTime == 0 ){
            this.setMessage("您刚开始访问系统，祝您愉快");
        }else{
            this.setMessage("您已经访问系统: "+ usedTime + " 分钟 " );
        }
        return SUCCESS;
    }
}
