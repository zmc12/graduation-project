package com.jsut.web.mapper;

import com.jsut.web.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 19:34
 */
@Mapper
public interface NoticeMapper {
    List<Notice> selectAll(String name);

    void deleteById(Integer id);

    void insert(Notice notice);

    void updateById(Notice notice);
}
