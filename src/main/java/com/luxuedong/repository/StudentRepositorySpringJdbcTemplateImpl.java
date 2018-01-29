package com.luxuedong.repository;

import com.luxuedong.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luxuedong
 * 2018/1/29 下午5:35
 */
public class StudentRepositorySpringJdbcTemplateImpl implements StudentRepository{

    private JdbcTemplate jdbcTemplate;

    public List<Student> queryAll() {
        final List<Student> students = new ArrayList<Student>();
        final String sql = "select id,name,age from student";

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                Student student = new Student();
                student.setAge(age);
                student.setId(id);
                student.setName(name);
                students.add(student);
            }
        });

        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
