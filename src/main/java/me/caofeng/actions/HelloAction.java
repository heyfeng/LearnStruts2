package me.caofeng.actions;

import com.opensymphony.xwork2.ActionSupport;
import me.caofeng.beans.Book;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.actions
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-04 23:01
 * @Version: V1.0
 */
public class HelloAction extends ActionSupport{
    private HttpServletRequest request;
    private HttpSession session;
    private List<Book> books;
    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/4 22:18
     * @Description: 执行请求，返回处理结果
     */
    @Override
    public String execute() throws Exception {
        request = ServletActionContext.getRequest();
        session = request.getSession();
        request.setAttribute("name","request中的书名");
        session.setAttribute("name","session中的书名");
        books = new ArrayList<Book>();
        books.add(new Book("百年孤独",10,"马尔克斯"));
        books.add(new Book("血鹦鹉",20,"古龙"));
        books.add(new Book("少年的梦",30,"曹峰"));

        return SUCCESS;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
