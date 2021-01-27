package com.jsut.web.controller;

import com.jsut.web.pojo.Teacher;
import com.jsut.web.service.UserService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZhangMinCong
 * @date 2021/1/19 16:10
 */

@Controller
@RequestMapping("/user")
@Slf4j
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("user")String user, @RequestParam("password")String password){

        Teacher teacher=userService.selectByUser(user,password);

       if("".equals(teacher) || teacher==null){


           return "index";
       }else {
           User.COLLEGE=teacher.getCollege();
           User.Name=teacher.getName();
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
