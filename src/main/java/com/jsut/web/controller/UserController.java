package com.jsut.web.controller;

import com.jsut.web.pojo.Teacher;
import com.jsut.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ZhangMinCong
 * @date 2021/1/19 16:10
 */
@EnableAutoConfiguration
@Controller
@RequestMapping("/user")
@Slf4j
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("user")String user, @RequestParam("password")String password, @RequestParam("role")String role, HttpSession httpSession){
        //System.out.println(role);
        Teacher teacher=userService.selectByUser(user,password);

       if("".equals(teacher) || teacher==null){

           return "index";
       }else {

           httpSession.setAttribute("role",role);
           httpSession.setAttribute("name", teacher.getName());
           httpSession.setAttribute("college", teacher.getCollege());
           httpSession.setAttribute("userName", teacher.getUserName());
           httpSession.setAttribute("password", teacher.getPassword());
           httpSession.setAttribute("user", teacher);
           return "home";
       }

    }

    @GetMapping("/logout")
    public String loginout(HttpSession httpSession, SessionStatus sessionStatus){
        httpSession.invalidate();
        sessionStatus.setComplete();
        return "index";
    }

    @GetMapping("/gotoHome")
    public String home(){
        return "home";
    }


    @GetMapping("/return")
    public String index(){
        return "/index";
    }

    @GetMapping("/au")
    public String noAu(){
        return "noAu";
    }

}
