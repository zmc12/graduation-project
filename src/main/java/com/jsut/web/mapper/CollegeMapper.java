package com.jsut.web.mapper;

import com.jsut.web.pojo.College;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 12:02
 */

@Mapper
public interface CollegeMapper {

    List<College> selectByCollege(String college);
}
