package com.jsut.web.service;

import com.jsut.web.pojo.Absent;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 15:19
 */
@EnableAutoConfiguration

public interface AbsentService {

    List<Absent> selectAll(String college);


    int updateById(String id, String result);

    int updateById(String id, String result,String reply);

    List<Absent> select(String grade,String result);

    List<Absent> selectByResult();
}
