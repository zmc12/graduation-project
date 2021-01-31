package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 16:43
 */
@EnableAutoConfiguration
public class ResultCode implements Serializable {
    private Integer code;
    private String message;


    @Override
    public String toString() {
        return "ResultCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultCode() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
