package com.jsut.web.mapper;

import com.jsut.web.pojo.Curriculum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/27 15:58
 */

@Mapper
public interface CurriculumMapper {

    Curriculum select(@Param("grade") String grade,@Param("term") String term);

    void insert(Curriculum curriculum);

    void update(Curriculum curriculum);
}
