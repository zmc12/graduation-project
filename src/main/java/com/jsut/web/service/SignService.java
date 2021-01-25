package com.jsut.web.service;

import com.jsut.web.pojo.Sign;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 10:35
 */
public interface SignService {


    List<Sign> selectSign(String college);

    List<Sign> selctNoSign(String college);
}
