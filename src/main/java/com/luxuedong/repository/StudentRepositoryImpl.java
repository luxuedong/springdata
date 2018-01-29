package com.luxuedong.repository;

import com.luxuedong.domain.Student;
import com.luxuedong.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luxuedong
 * 2018/1/25 下午5:00
 */
public class StudentRepositoryImpl implements StudentRepository{

    public List<Student> queryAll() {

        List<Student> students = new ArrayList<Student>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select id,name,age from student";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            Student student = null;
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                student = new Student();
                student.setId(id);
                student.setAge(age);
                student.setName(name);

                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(resultSet,preparedStatement,connection);
        }

        return students;
    }
}
