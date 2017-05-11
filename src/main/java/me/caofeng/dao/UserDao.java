package me.caofeng.dao;

import me.caofeng.beans.User;
import me.caofeng.util.DbHelper;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.dao
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 9:10
 * @Version: V1.0
 */
public class UserDao implements UserDaoApi{
    private DbHelper dbHelper ;
    private Logger LOGGER ;

    public UserDao() {
        dbHelper = DbHelper.getInstance();
        LOGGER = Logger.getLogger(UserDao.class);
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet =  null;
        try {
            String selectSql = "SELECT id , name , phone FROM user ORDER BY id ";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(selectSql);
            LOGGER.debug(statement.toString());
            resultSet = statement.executeQuery();
            users = new ArrayList<>();
            User user = null;
            int id ;
            String name ;
            String phone;
            while (resultSet.next()){
               id = resultSet.getInt("id") ;
               name = resultSet.getString("name");
               phone = resultSet.getString("phone");
               user = new User(id,name,phone);
               users.add(user);
            }
        } catch (SQLException e) {
            LOGGER.error("获取所有用户失败");
            LOGGER.error(e);
        }finally {
            dbHelper.close(connection,statement,resultSet);
        }
        return users;
    }

    @Override
    public User getUserById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            String selectSql = " SELECT * FROM user WHERE id = ? ";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(selectSql);
            statement.setInt(1,id);
            LOGGER.debug(statement.toString());
            resultSet = statement.executeQuery();
            String name;
            String gender;
            int age;
            String phone;
            String email;
            String major;
            String school;
            String address;

            while (resultSet.next()){
                name = resultSet.getString("name");
                gender = resultSet.getString("gender");
                age = resultSet.getInt("age");
                phone = resultSet.getString("phone");
                email = resultSet.getString("email");
                major = resultSet.getString("major");
                school = resultSet.getString("school");
                address = resultSet.getString("address");
                user = new User(id,name,gender,age,phone,email,major,school,address);
            }
        } catch (SQLException e) {
            LOGGER.error("获取用户失败");
            LOGGER.error(e);
        }finally {
            dbHelper.close(connection,statement,resultSet);
        }
        return user;
    }

    @Override
    public boolean addUser(User user) {
        boolean flag = false;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String insertSql = " INSERT INTO user " +
                    "(name,gender,age,phone,email,major,school,address)" +
                    " values (?,?,?,?,?,?,?,?)";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(insertSql);
            statement.setString(1,user.getName());
            statement.setString(2,user.getGender());
            statement.setInt(3,user.getAge());
            statement.setString(4,user.getPhone());
            statement.setString(5,user.getEmail());
            statement.setString(6,user.getMajor());
            statement.setString(7,user.getSchool());
            statement.setString(8,user.getAddress());
            LOGGER.debug(statement.toString());
            flag = statement.executeUpdate() >= 1;
        } catch (SQLException e) {
            LOGGER.error("添加用户信息失败");
            LOGGER.error(e);
        }finally {
            dbHelper.close(connection,statement,null);
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag = false;
        Connection connection = null;
        PreparedStatement statement = null;
        LOGGER.debug(user.toString());
        try {
            String updateSql = " UPDATE user set name = ? , gender = ? ,age = ? ," +
                    " phone = ? , email = ? , major = ? ,school = ? ,address = ? " +
                    " WHERE id = ? ";
            connection = dbHelper.getConnection();
            statement  = connection.prepareStatement(updateSql);
            statement.setString(1,user.getName());
            statement.setString(2,user.getGender());
            statement.setInt(3,user.getAge());
            statement.setString(4,user.getPhone());
            statement.setString(5,user.getEmail());
            statement.setString(6,user.getMajor());
            statement.setString(7,user.getSchool());
            statement.setString(8,user.getAddress());
            statement.setInt(9,user.getId());
            LOGGER.debug(statement.toString());
            flag = statement.executeUpdate() >= 1;
        } catch (SQLException e) {
            LOGGER.error("更新用户信息失败");
            LOGGER.error(e);
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag = false;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String deleteSql = "DELETE FROM user WHERE id = ?  ";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(deleteSql);
            statement.setInt(1,id);
            LOGGER.debug(statement.toString());
            flag = statement.executeUpdate() >= 1;
        } catch (SQLException e) {
            LOGGER.error("删除用户失败");
            LOGGER.error(e);
        }finally {
            dbHelper.close(connection,statement,null);
        }
        return flag;
    }
}
