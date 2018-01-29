package com.luxuedong.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 * 1）获取Connection
 * 2）释放资源
 *
 * Created by luxuedong
 * 2018/1/25 下午4:27
 */
public class JDBCUtil {

    /**
     * 获取Connection
     *
     * @return 所获取的JDBCConnection
     */
    public static Connection getConnection() throws Exception {

        InputStream resourceAsStream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);


        Class.forName(properties.getProperty("jdbc.drverClass"));
        Connection connection = DriverManager.getConnection(properties.getProperty("jdbc.url"), properties.getProperty("jdbc.user"), properties.getProperty("jdbc.password"));

        return connection;
    }

    /**
     * 释放
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet, Statement statement,Connection connection){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (statement != null){
            try{
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (connection != null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
