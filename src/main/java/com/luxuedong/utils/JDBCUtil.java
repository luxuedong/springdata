package com.luxuedong.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql:///spring_data";
        String user = "root";
        String password = "luxd5657";
        String drverClass = "com.mysql.jdbc.Driver";

        Class.forName(drverClass);
        Connection connection = DriverManager.getConnection(url, user, password);

        return connection;
    }
}
