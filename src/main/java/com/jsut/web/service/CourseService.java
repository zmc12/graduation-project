package com.jsut.web.service;


import com.jsut.web.pojo.Course;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/5/25 12:58
 */
public interface CourseService  {

    void concat(String name, String subject);

    List<Course> selectMine(String name);

    List<Course> selectAll();
}
