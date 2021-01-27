package com.jsut.web.service.Impl;

import com.jsut.web.mapper.CurriculumMapper;
import com.jsut.web.pojo.Curriculum;
import com.jsut.web.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/27 15:58
 */
@Service
public class CurriculumSerivceImpl implements CurriculumService {

    @Autowired
    private CurriculumMapper curriculumMapper;

    @Override
    public Curriculum select(String grade, String term) {
        return curriculumMapper.select(grade,term);
    }

    @Override
    public void insert(Curriculum curriculum) {
        curriculumMapper.insert(curriculum);
    }

    @Override
    public void update(Curriculum curriculum) {
        curriculumMapper.update(curriculum);
    }
}
