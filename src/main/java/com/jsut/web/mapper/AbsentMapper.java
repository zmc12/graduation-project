package com.jsut.web.mapper;

import com.jsut.web.pojo.Absent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 15:21
 */
@EnableAutoConfiguration
@Mapper
public interface AbsentMapper {
    List<Absent> selectAll(String college);


    int updateById(@Param("id") String id,@Param("result") String result);
}
