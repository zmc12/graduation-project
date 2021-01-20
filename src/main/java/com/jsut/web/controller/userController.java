package com.jsut.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZhangMinCong
 * @date 2021/1/19 16:10
 */

@Controller
@RequestMapping("/user")
@Slf4j
public class userController {

    @PostMapping("/login")
    public String login(@RequestParam("user")String user,@RequestParam("password")String password){
       if(("admin").equals(user) && ("12345").equals(password)){
           return "home";
       }else {
           return "index";
       }

    }

    @GetMapping("/logout")
    public String loginout(){
        return "index";
    }

    @GetMapping("/gotoHome")
    public String home(){
        return "home";
    }

}
