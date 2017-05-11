import me.caofeng.beans.User;
import me.caofeng.dao.UserDao;
import me.caofeng.dao.UserDaoApi;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: PACKAGE_NAME
 * @Description: 测试用户访问数据库
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 9:21
 * @Version: V1.0
 */
public class TestUserDao {
    private Logger LOGGER ;
    private UserDaoApi userDaoApi;

    @Before
    public void init(){
        LOGGER = Logger.getLogger(TestUserDao.class);
        userDaoApi = new UserDao();
    }

    @Test
    public void getAllUser(){
        List<User> users = userDaoApi.getAllUser();
        for (User user : users){
            LOGGER.debug(user.getId() + " " + user.getName() + " " + user.getPhone());
        }
        assertEquals(1,users.size());
    }

    @Test
    public void getUser(){
        User user = userDaoApi.getUserById(2);
        LOGGER.debug(user);
        assertEquals("不鸟万峰",user.getName());
        assertEquals("IMUST",user.getSchool());
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setName("不鸟万峰");
        user.setGender("男");
        user.setAge(23);
        user.setPhone("18612692454");
        user.setEmail("buniaowanfeng@outlook.com");
        user.setMajor("CS");
        user.setSchool("MIT");
        user.setAddress("广州");
        boolean result = userDaoApi.addUser(user);
        assertEquals(true,result);
    }

    @Test
    public void deleteUser(){
       boolean result = userDaoApi.deleteUser(1);
       assertEquals(true,result);
    }

    @Test
    public void updateUser(){
        User user = userDaoApi.getUserById(2);
        user.setSchool("IMUST");
        boolean result = userDaoApi.updateUser(user);
        assertEquals(true,result);
    }
}
