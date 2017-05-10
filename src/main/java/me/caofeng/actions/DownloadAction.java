package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-10 15:19
 * @Version: V1.0
 */
public class DownloadAction extends ActionSupport{

    public InputStream getDownloadFile(){
        return ServletActionContext.getServletContext().getResourceAsStream("/001.jpg");
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
