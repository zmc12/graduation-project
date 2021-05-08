package com.jsut.web.controller;

import com.jsut.web.pojo.Absent;
import com.jsut.web.pojo.College;
import com.jsut.web.pojo.ResultCode;
import com.jsut.web.service.AbsentService;
import com.jsut.web.service.CollegeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 9:32
 */
@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/absent")
@CrossOrigin(origins = "*",maxAge = 3600)
public class AbsentController {

    @Autowired
    private AbsentService absentService;

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/first")
    public String first(Model model, HttpServletRequest request){
        Object college = request.getSession().getAttribute("college");



        List<Absent> list=absentService.selectAll(college.toString());
        List<College> colleges = collegeService.selectByCollege(college.toString());

        model.addAttribute("absents",list);
        model.addAttribute("colleges",colleges);
        List<Absent> absents = absentService.selectByResult();
        model.addAttribute("hasConfirms",absents);

        return "absent";
    }


    @ResponseBody
    @PutMapping("/update")
    public ResultCode update(@RequestParam("id")String id, @RequestParam("result")String result,@RequestParam(value = "reply",required = false)String reply){
        int i;
        if(reply==null){
            i=absentService.updateById(id,result);
        }
        else {
            i=absentService.updateById(id,result,reply);
        }
        if(i==1){
            return new ResultCode(200,"提交成功");
        }else {
            return new ResultCode(200,"提交失败");
        }


    }



    @ResponseBody
    @GetMapping("/select")
    public List<Absent> select(@RequestParam("grade")String grade){
        List<Absent> absents = absentService.select(grade);
        return absents;
    }
}
