package com.jsut.web.mapper;

import com.jsut.web.pojo.College;
import com.jsut.web.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 19:34
 */
@EnableAutoConfiguration
@Mapper
public interface NoticeMapper {
    List<Notice> selectAll(String name);

    void deleteById(Integer id);

    void insert(Notice notice);

    void updateById(Notice notice);

    List<College> selectAll();
}
