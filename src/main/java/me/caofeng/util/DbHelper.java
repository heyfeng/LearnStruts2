package me.caofeng.util;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.util
 * @Description: jdbc连接工具
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 1:48
 * @Version: V1.0
 */
public class DbHelper {
    private static Logger LOGGER;
    private static BasicDataSource dataSource = null;

    private static class DbHelperHolder {
        private static DbHelper dbHelper = new DbHelper();
    }

    private DbHelper() {
        LOGGER = Logger.getLogger(DbHelper.class);
        init();
    }

    public static DbHelper getInstance() {
        return DbHelperHolder.dbHelper;
    }

    private void init() {
        try {
            InputStream inputStream = DbHelper.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            String driveClassName = properties.getProperty("driveClassName");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            String initialSize = properties.getProperty("initialSize");
            String minIdle = properties.getProperty("minIdle");
            String maxIdle = properties.getProperty("maxIdle");
            String maxWait = properties.getProperty("maxWait");
            String maxActive = properties.getProperty("maxActive");

            dataSource = new BasicDataSource();
            dataSource.setDriverClassName(driveClassName);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            // 初始化连接数
            if (initialSize != null)
                dataSource.setInitialSize(Integer.parseInt(initialSize));

            // 最小空闲连接
            if (minIdle != null)
                dataSource.setMinIdle(Integer.parseInt(minIdle));

            // 最大空闲连接
            if (maxIdle != null)
                dataSource.setMaxIdle(Integer.parseInt(maxIdle));

            // 超时回收时间(以毫秒为单位)
            if (maxWait != null)
                dataSource.setMaxWait(Long.parseLong(maxWait));

            // 最大连接数
            if (maxActive != null) {
                if (!maxActive.trim().equals("0"))
                    dataSource.setMaxActive(Integer.parseInt(maxActive));
            }
        } catch (Exception e) {
            LOGGER.error("设置数据库连接池配置失败");
            LOGGER.error(e);
        }
    }

    /**
     * 获取连接
     *
     * @return
     * @throws SQLException
     */
    public synchronized Connection getConnection() throws SQLException {
        if (dataSource == null) {
            init();
        }
        Connection connection = null;
        if (dataSource != null) {
            connection = dataSource.getConnection();
        }
        return connection;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/4/27 19:22
     * @Description: 关闭资源
     * @param connection
     * @param resultSet
     * @param statement
     */
    public void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {

        try {
            if (resultSet != null)
                resultSet.close();

            if (statement != null)
                statement.close();

            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            LOGGER.debug("关闭资源失败");
            LOGGER.error(e);
        }
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/4/27 19:22
     * @Description: 数据回滚
     */
    public boolean rollBack(Connection connection) {
        try {
            if (connection != null) {
                connection.rollback();
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            LOGGER.error("数据回滚失败");
            LOGGER.error(e);
            return false;
        }
    }
}
