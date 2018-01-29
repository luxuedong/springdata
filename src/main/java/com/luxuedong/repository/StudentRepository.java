package com.luxuedong.repository;

import com.luxuedong.domain.Student;

import java.util.List;

/**
 * Created by luxuedong
 * 2018/1/25 下午4:59
 */
public interface StudentRepository {

    /**
     * 查询所有学生
     * @return 返回所有学生
     */
    public List<Student> queryAll();
}
