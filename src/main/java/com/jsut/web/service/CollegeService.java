package com.jsut.web.service;

import com.jsut.web.pojo.College;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 12:01
 */
@EnableAutoConfiguration

public interface CollegeService {
    List<College> selectByCollege();

    List<College> selectGrade(String college);

    List<College> selectAll();
}
