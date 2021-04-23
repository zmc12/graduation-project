package com.jsut.web.mapper;

import com.jsut.web.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:44
 */
@EnableAutoConfiguration
@Mapper
public interface StudentMapper {

    List<Student> selectAll(String college);

    List<Student> selectByGrade(String grade);
}
