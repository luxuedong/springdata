package com.luxuedong.utils;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by luxuedong
 * 2018/1/25 下午4:35
 */
public class JDBCUtilTest {


    @Test
    public void testConnection() throws SQLException, ClassNotFoundException {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }

}