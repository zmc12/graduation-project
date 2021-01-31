package com.jsut.web.service.Impl;

import com.jsut.web.mapper.UserMapper;
import com.jsut.web.pojo.Teacher;
import com.jsut.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 15:34
 */

@Service
@EnableAutoConfiguration


public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public Teacher  selectByUser(String userName, String password) {
        Teacher teacher=userMapper.selectByUser(userName,password);

        return teacher;
    }
}
