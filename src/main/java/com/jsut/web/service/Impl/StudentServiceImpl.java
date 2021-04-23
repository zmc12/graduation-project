package com.jsut.web.service.Impl;

import com.jsut.web.mapper.StudentMapper;
import com.jsut.web.pojo.Student;
import com.jsut.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:44
 */
@Service
@EnableAutoConfiguration


public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    public List<Student> selectAll(String college) {
        return studentMapper.selectAll(college);
    }

    @Override
    public List<Student> selectByGrade(String grade) {
        return studentMapper.selectByGrade(grade);
    }
}
