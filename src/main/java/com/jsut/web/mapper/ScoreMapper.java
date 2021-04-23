package com.jsut.web.mapper;

import com.jsut.web.pojo.Score;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:40
 */
@EnableAutoConfiguration
@Mapper
public interface ScoreMapper {
    List<Score> selectByName(String name);

    void deleteById(Integer id);

    void insert(Score score);

    void updateById(Score score);

    List<Score> ifHas(Score score);
}
