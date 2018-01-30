package com.luxuedong.repository;

import com.luxuedong.domain.Student;
import org.junit.Test;

import java.util.List;

/**
 * Created by luxuedong
 * 2018/1/25 下午5:10
 */
public class StudentRepositoryImplTest {

    @Test
    public void testQueryAll(){
        StudentRepository studentRepository = new StudentRepositoryJdbcImpl();

        List<Student> students = studentRepository.queryAll();

        for (Student student:students){
            System.out.println(student);
        }

    }
}