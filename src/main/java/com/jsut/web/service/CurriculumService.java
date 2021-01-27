package com.jsut.web.service;

import com.jsut.web.pojo.Curriculum;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/27 15:58
 */
public interface CurriculumService {
    Curriculum select(String grade, String term);

    void insert(Curriculum curriculum);

    void update(Curriculum curriculum);
}
