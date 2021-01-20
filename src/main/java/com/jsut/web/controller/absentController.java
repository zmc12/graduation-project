package com.jsut.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 9:32
 */

@Controller
@Slf4j
@RequestMapping("/absent")
public class absentController {

    @GetMapping("/first")
    public String absent(){

        return "absent";
    }
}
