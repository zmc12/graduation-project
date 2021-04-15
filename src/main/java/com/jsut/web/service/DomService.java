package com.jsut.web.service;

import com.jsut.web.pojo.Dom;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 15:05
 */
@EnableAutoConfiguration

public interface DomService  {
    List<Dom> selectAll();


    void deleteById(Integer id);

    void insert(Dom dom);

    void updateById(Dom dom);


    List<Dom> select(String grade,String term);
}
