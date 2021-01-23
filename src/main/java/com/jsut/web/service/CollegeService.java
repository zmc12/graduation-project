package com.jsut.web.service;

import com.jsut.web.pojo.College;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 12:01
 */
public interface CollegeService {
    List<College> selectByCollege(String college);
}
