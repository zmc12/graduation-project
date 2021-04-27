package com.jsut.web.service;

import com.jsut.web.pojo.Notice;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 19:28
 */
@EnableAutoConfiguration

public interface NoticeService {
    List<Notice> selectAll(String name);

    void deleteById(Integer id);

    void insert(Notice notice);

    void updateById(Notice notice);


}
