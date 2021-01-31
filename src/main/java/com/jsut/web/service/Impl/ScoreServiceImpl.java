package com.jsut.web.service.Impl;

import com.jsut.web.mapper.ScoreMapper;
import com.jsut.web.pojo.Score;
import com.jsut.web.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:40
 */
@Service
@EnableAutoConfiguration


public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;


    public List<Score> selectByName(String name) {
        return scoreMapper.selectByName(name);
    }

    public void deleteById(Integer id) {

        scoreMapper.deleteById(id);

    }

    public void insert(Score score) {
        scoreMapper.insert(score);
    }

    public void updateById(Score score) {
        scoreMapper.updateById(score);
    }
}
