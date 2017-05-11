package me.caofeng.dao;

import me.caofeng.beans.User;

import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.dao
 * @Description: 用户访问数据库接口
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 9:03
 * @Version: V1.0
 */
public interface UserDaoApi {
    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/11 9:08
     * @Description: 获取所有用户
    */
    List<User> getAllUser();
    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/11 9:08
     * @Description: 根据用户ID获取用户完整信息
     * @param id  用户编号
    */
    User getUserById(int id);

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/11 9:09
     * @Description: 添加新的用户
     * @param user  用户信息
    */
    boolean addUser(User user);

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/11 9:09
     * @Description: 更新用户
     * @param user 新的用户信息
    */
    boolean updateUser(User user);

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/11
     * @Description: 删除用户
     * @param id 用户ID
    */
    boolean deleteUser(int id);

}
