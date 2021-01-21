package com.jsut.web.service;

import com.jsut.web.pojo.Teacher;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 15:34
 */
public interface UserService {
    Teacher  selectByUser(String userName, String password);
}
