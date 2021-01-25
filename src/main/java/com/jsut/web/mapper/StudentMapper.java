package com.jsut.web.mapper;

import com.jsut.web.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 13:44
 */
@Mapper
public interface StudentMapper {

    List<Student> selectAll(String college);
}
