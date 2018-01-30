package com.luxuedong.repository;

import com.luxuedong.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by luxuedong
 * 2018/1/29 下午5:42
 */
public class StudentRepositorySpringJdbcTemplateImplTest {

    private ApplicationContext ctx = null;

    private StudentRepository studentRepository = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("beans-jdbcTemplate.xml");
        studentRepository = (StudentRepository)ctx.getBean("studentRepositorySpringJdbcTemplateImpl");
        System.out.println("setup()");
    }

    @After
    public void tearDown(){
        ctx = null;
        System.out.println("tearDown()");
    }

    @Test
    public void testQueryAll(){

        List<Student> students = studentRepository.queryAll();

        for (Student student:students){
            System.out.println(student);
        }

    }
}