package com.luxuedong;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by luxuedong
 * 2018/1/29 下午5:09
 */
public class SpringJpaTest {



    private ApplicationContext ctx = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("beans-jpa.xml");
        System.out.println("setup()");
    }

    @After
    public void tearDown(){
        ctx = null;
        System.out.println("tearDown()");
    }

    @Test
    public void testDataSource(){
    }


}
