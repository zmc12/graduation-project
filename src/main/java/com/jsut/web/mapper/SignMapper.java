package com.jsut.web.mapper;

import com.jsut.web.pojo.Sign;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 10:35
 */
@Mapper
public interface SignMapper {

    List<Sign> selectSign(String college);

    List<Sign> selctNoSign(String college);
}
