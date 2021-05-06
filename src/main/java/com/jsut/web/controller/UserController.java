package com.jsut.web.controller;

import com.jsut.web.pojo.Teacher;
import com.jsut.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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
    public String login(@RequestParam("user")String user, @RequestParam("password")String password, HttpServletResponse response){

        Teacher teacher=userService.selectByUser(user,password);

       if("".equals(teacher) || teacher==null){

           return "index";
       }else {
           Cookie[] cookie = new Cookie[4];
           Cookie cookie0 = new Cookie("name", teacher.getName());
           Cookie cookie1 = new Cookie("college", teacher.getCollege());
           Cookie cookie2 = new Cookie("userName", teacher.getUserName());
           Cookie cookie3 = new Cookie("password", teacher.getPassword());
           cookie[0]=cookie0;
           cookie[1]=cookie1;
           cookie[2]=cookie2;
           cookie[3]=cookie3;
           for(int i=0; i<cookie.length;i++){
               cookie[i].setMaxAge(60*60*24*7);
               cookie[i].setPath("/");
               response.addCookie(cookie[i]);
           }


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
