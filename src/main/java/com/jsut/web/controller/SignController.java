package com.jsut.web.controller;

import com.jsut.web.pojo.College;
import com.jsut.web.pojo.Sign;
import com.jsut.web.service.CollegeService;
import com.jsut.web.service.SignService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 15:23
 */
@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/sign")
@CrossOrigin(origins = "*",maxAge = 3600)
public class SignController {

    @Autowired
    private SignService signService;


    @Autowired
    private CollegeService collegeService;

    @GetMapping("/first")
    public String first(Model model) {
        List<Sign> list1=signService.selectSign();
        List<Sign> list2= signService.selctNoSign();
        List<College> colleges = collegeService.selectByCollege(User.COLLEGE);
        List<Sign> signs = signService.selectAll();

        model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);
        model.addAttribute("colleges",colleges);
        model.addAttribute("signs",signs);
        return "sign";

    }


    @ResponseBody
    @GetMapping("/select")
    public List<Sign> select(@RequestParam("grade")String grade,@RequestParam("time")String time){
        List<Sign> signs = signService.select(grade, time);

        return signs;
    }
}
