package com.jsut.web.mapper;

import com.jsut.web.pojo.Sign;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 10:35
 */
@EnableAutoConfiguration
@Mapper
public interface SignMapper {

    List<Sign> selectSign( );

    List<Sign> selctNoSign( );

    List<Sign> selectAll();

    List<Sign> select(@Param("grade") String grade,@Param("time") String time);
}
