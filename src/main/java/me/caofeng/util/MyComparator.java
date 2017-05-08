package me.caofeng.util;

import java.util.Comparator;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.util
 * @Description: 自定义比较器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 15:11
 * @Version: V1.0
 */
public class MyComparator implements Comparator{

    public int compare(Object o1, Object o2) {
        return ((String)o1).compareTo((String) o2);
    }
}
