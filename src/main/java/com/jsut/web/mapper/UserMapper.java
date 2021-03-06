package com.jsut.web.mapper;

import com.jsut.web.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 15:35
 */
@EnableAutoConfiguration
@Mapper
public interface UserMapper {

    Teacher  selectByUser(@Param("userName") String user,@Param("password") String password);
}
