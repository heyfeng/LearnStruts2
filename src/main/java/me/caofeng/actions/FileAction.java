package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description: 文件处理
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-10 11:34
 * @Version: V1.0
 */
public class FileAction extends ActionSupport{
    /**
     * 上传的文件
     */
    private File upload;
    /**
     * 文件类型
     */
    private String uploadContentType;
    /**
     * 文件名字
     */
    private String uploadFileName;

    private String error;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/10 11:36
     * @Description: 文件上传
    */
    public String upload() throws IOException {

        //判断上传文件是否为空
        if (null == upload){
            System.out.println("上传文件为空");
            error="上传文件为空";
            this.addFieldError("upload",error);
            return INPUT;
        }

        System.out.println(upload.getName());
        System.out.println(" 文件名 " + uploadFileName + " 文件类型 " + uploadContentType);
        //获取文件输入流
        InputStream inputStream = new FileInputStream(upload);
        //设置上传文件目录
        String uploadPath = ServletActionContext.getServletContext().getRealPath("/"+uploadFileName);
        //创建输出流
        OutputStream outputStream = new FileOutputStream(uploadPath);
        byte[] buffer = new byte[1024];
        int length = 0 ;
        //将输入流写入输出流
        while (0 < (length =  inputStream.read(buffer))){
            outputStream.write(buffer,0,length);
        }

        // 关闭资源
        inputStream.close();
        outputStream.close();
        return SUCCESS;
    }



}
