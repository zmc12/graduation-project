package com.jsut.web.service;

import com.jsut.web.pojo.Student;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:42
 */
@EnableAutoConfiguration

public interface StudentService {
    List<Student> selectAll(String college);


    List<Student> selectByGrade(String grade);
}
