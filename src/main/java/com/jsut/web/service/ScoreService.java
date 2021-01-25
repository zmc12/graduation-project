package com.jsut.web.service;

import com.jsut.web.pojo.Score;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:39
 */

public interface ScoreService {
    List<Score> selectByName(String name);

    void deleteById(Integer id);

    void insert(Score score);

    void updateById(Score score);
}
