package me.caofeng.service;

import me.caofeng.beans.Book;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.service
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-07 22:48
 * @Version: V1.0
 */
public class BookService {
    public Book[] getBooks(){
        System.out.println(" book service ");
        return new Book[]{
                new Book("Java编程实现","埃克尔"),
                new Book("Jsp程序设计","测试"),
                new Book("设计","设计")
        };
    }
}
