package com.jsut.web.service.Impl;

import com.jsut.web.mapper.CollegeMapper;
import com.jsut.web.pojo.College;
import com.jsut.web.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 12:02
 */
@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public List<College> selectByCollege(String college) {
        List<College> colleges = collegeMapper.selectByCollege(college);

        return colleges;
    }
}
