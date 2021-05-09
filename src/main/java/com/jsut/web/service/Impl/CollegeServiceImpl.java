package com.jsut.web.service.Impl;

import com.jsut.web.mapper.CollegeMapper;
import com.jsut.web.pojo.College;
import com.jsut.web.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 12:02
 */
@Service
@EnableAutoConfiguration

public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper collegeMapper;


    public List<College> selectByCollege() {
        List<College> colleges = collegeMapper.selectByCollege();

        return colleges;
    }

    @Override
    public List<College> selectGrade(String college) {
        return collegeMapper.selectGrade(college);
    }

    @Override
    public List<College> selectAll() {
        return collegeMapper.selectAll();
    }
}
