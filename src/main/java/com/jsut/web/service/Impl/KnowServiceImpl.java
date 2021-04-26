package com.jsut.web.service.Impl;

import com.jsut.web.mapper.KnowMapper;
import com.jsut.web.pojo.Know;
import com.jsut.web.pojo.Student;
import com.jsut.web.service.KnowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/4/25 15:07
 */
@Service
public class KnowServiceImpl implements KnowService {

    @Autowired
    private KnowMapper knowMapper;

    @Override
    public void insert(Know know) {
        knowMapper.insert(know);
    }

    @Override
    public void deleteById(Integer id) {
        knowMapper.deleteById(id);
    }

    @Override
    public void updateById(Know know) {

        knowMapper.updateById(know);
    }

    @Override
    public List<Know> selectStudent(Integer id, String grade) {
        return knowMapper.selectStudent(id, grade);
    }
}
