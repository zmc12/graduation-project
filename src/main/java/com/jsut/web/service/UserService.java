package com.jsut.web.service;

import com.jsut.web.pojo.Teacher;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 15:34
 */
@EnableAutoConfiguration

public interface UserService {
    Teacher  selectByUser(String userName, String password);
}
