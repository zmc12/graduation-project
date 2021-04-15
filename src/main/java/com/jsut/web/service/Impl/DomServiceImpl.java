package com.jsut.web.service.Impl;

import com.jsut.web.mapper.DomMapper;
import com.jsut.web.pojo.Dom;
import com.jsut.web.service.DomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/23 15:05
 */

@Service
@EnableAutoConfiguration

public class DomServiceImpl implements DomService {

    @Autowired
    private DomMapper domMapper;

    @Override
    public List<Dom> selectAll() {
        List<Dom> doms = domMapper.selectAll();
        return doms;
    }

    @Override
    public void deleteById(Integer id) {
        domMapper.deleteById(id);
    }

    @Override
    public void insert(Dom dom) {
        domMapper.insert(dom);
    }

    @Override
    public void updateById(Dom dom) {
        domMapper.updateById(dom);
    }

    @Override
    public List<Dom> select(String grade,String term) {
        return domMapper.select(grade,term);
    }
}
