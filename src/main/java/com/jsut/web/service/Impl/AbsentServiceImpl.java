package com.jsut.web.service.Impl;

import com.jsut.web.mapper.AbsentMapper;
import com.jsut.web.pojo.Absent;
import com.jsut.web.service.AbsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 15:20
 */
@Service
@EnableAutoConfiguration

public class AbsentServiceImpl implements AbsentService {
    @Autowired
    private AbsentMapper absentMapper;

    @Override
    public List<Absent> selectAll(String college) {
        List<Absent> list=absentMapper.selectAll(college);
        return list;
    }

    @Override
    public int updateById(String id, String result) {
        int i=absentMapper.updateById(id,result);
        return i;
    }


}
