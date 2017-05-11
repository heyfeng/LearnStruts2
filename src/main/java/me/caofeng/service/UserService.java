package me.caofeng.service;

import me.caofeng.beans.User;
import me.caofeng.dao.UserDao;
import me.caofeng.dao.UserDaoApi;

import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.service
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 10:35
 * @Version: V1.0
 */
public class UserService implements UserServiceApi {
    private UserDaoApi userDaoApi;

    public UserService() {
        userDaoApi = new UserDao();
    }

    @Override
    public List<User> getAllUser() {
        return userDaoApi.getAllUser();
    }

    @Override
    public User getUserById(int id) {
        return userDaoApi.getUserById(id);
    }

    @Override
    public boolean addUser(User user) {
        return userDaoApi.addUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userDaoApi.updateUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userDaoApi.deleteUser(id);
    }
}
