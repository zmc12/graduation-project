package com.jsut.web.service;

import com.jsut.web.pojo.Sign;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/25 10:35
 */
@EnableAutoConfiguration

public interface SignService {


    List<Sign> selectSign(String college);

    List<Sign> selctNoSign(String college);
}
