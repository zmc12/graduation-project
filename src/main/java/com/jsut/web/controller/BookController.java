package com.jsut.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 11:09
 */
@Controller
@Slf4j
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/first")
    public String first(){
        return "book";
    }
}
