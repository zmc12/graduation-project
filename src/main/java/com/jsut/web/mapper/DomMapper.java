package com.jsut.web.mapper;

import com.jsut.web.pojo.Dom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 15:06
 */

@Mapper
public interface DomMapper {
    List<Dom> selectAll();

    void deleteById(Integer id);

    void insert(Dom dom);

    void updateById(Dom dom);
}
