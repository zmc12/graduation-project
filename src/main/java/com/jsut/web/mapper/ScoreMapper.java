package com.jsut.web.mapper;

import com.jsut.web.pojo.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:40
 */
@Mapper
public interface ScoreMapper {
    List<Score> selectByName(String name);

    void deleteById(Integer id);

    void insert(Score score);

    void updateById(Score score);
}
