package me.caofeng.beans;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.beans
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 18:11
 * @Version: V1.0
 */
public class Book {
    private String name;
    private int price;
    private String author;

    public Book() {

    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
