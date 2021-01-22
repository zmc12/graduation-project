package com.jsut.web.service;

import com.jsut.web.pojo.Absent;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 15:19
 */
public interface AbsentService {

    List<Absent> selectAll(String college);


    int updateById(String id, String result);
}
