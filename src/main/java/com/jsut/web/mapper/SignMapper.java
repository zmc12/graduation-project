package com.jsut.web.mapper;

import com.jsut.web.pojo.Sign;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 10:35
 */
@EnableAutoConfiguration
@Mapper
public interface SignMapper {

    List<Sign> selectSign(String college);

    List<Sign> selctNoSign(String college);
}
