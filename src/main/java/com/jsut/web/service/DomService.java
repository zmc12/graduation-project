package com.jsut.web.service;

import com.jsut.web.pojo.Dom;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 15:05
 */

public interface DomService  {
    List<Dom> selectAll();


    void deleteById(Integer id);

    void insert(Dom dom);

    void updateById(Dom dom);
}
