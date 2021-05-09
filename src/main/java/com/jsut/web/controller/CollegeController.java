package com.jsut.web.controller;

import com.jsut.web.pojo.College;
import com.jsut.web.service.CollegeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/5/9 15:45
 */

@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/college")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CollegeController {

    @Autowired
    private CollegeService collegeService;


    @ResponseBody
    @GetMapping("/selectGrade")
    public List<College> selectGrade(@RequestParam("college")String college){
        List<College> colleges = collegeService.selectGrade(college);

        return colleges;
    }
}
