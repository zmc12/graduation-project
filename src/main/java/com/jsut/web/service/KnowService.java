package com.jsut.web.service;

import com.jsut.web.pojo.Know;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/4/25 15:06
 */

@EnableAutoConfiguration
public interface KnowService {

    void insert(Know know);
    void deleteById(Integer id);

    void updateById(Know know);


    List<Know> selectStudent(Integer id, String grade);
}
