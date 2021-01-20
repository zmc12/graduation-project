package com.jsut.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 13:32
 */
@Controller
@Slf4j
@RequestMapping("/notice")
public class noticeController {


    @GetMapping("/first")
    public String first(){
        return "notice";
    }
}
