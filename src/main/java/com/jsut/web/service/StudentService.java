package com.jsut.web.service;

import com.jsut.web.pojo.Student;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:42
 */
public interface StudentService {
    List<Student> selectAll(String college);
}
