package com.jsut.web.service.Impl;

import com.jsut.web.mapper.SignMapper;
import com.jsut.web.pojo.Sign;
import com.jsut.web.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 10:35
 */

@Service
@EnableAutoConfiguration

public class SignServiceImpl implements SignService {
    @Autowired
    private SignMapper signMapper;


    public List<Sign> selectSign( ) {
        return signMapper.selectSign();
    }

    public List<Sign> selctNoSign( ) {
        return signMapper.selctNoSign();
    }

    @Override
    public List<Sign> selectAll() {
        return signMapper.selectAll();
    }

    @Override
    public List<Sign> select(String grade, String time) {
        return signMapper.select(grade,time);
    }
}
