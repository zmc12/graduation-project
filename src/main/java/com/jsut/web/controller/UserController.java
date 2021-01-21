package com.jsut.web.controller;

import com.jsut.web.pojo.Teacher;
import com.jsut.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("user")String user, @RequestParam("password")String password){

        Teacher teacher=userService.selectByUser(user,password);

       if("".equals(teacher) || teacher==null){
           return "index";
       }else {
           return "home";
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
