package com.jsut.web.service.Impl;


import com.jsut.web.mapper.CourseMapper;
import com.jsut.web.pojo.Course;
import com.jsut.web.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/5/25 12:58
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;


    @Override
    public void concat(String name,String subject) {
        courseMapper.concat(name,subject);
    }

    @Override
    public List<Course> selectMine(String name) {
        return courseMapper.selectMine(name);
    }

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }
}
