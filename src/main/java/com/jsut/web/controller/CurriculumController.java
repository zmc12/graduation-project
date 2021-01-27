package com.jsut.web.controller;

import com.jsut.web.pojo.College;
import com.jsut.web.pojo.Curriculum;
import com.jsut.web.pojo.ResultCode;
import com.jsut.web.service.CollegeService;
import com.jsut.web.service.CurriculumService;
import com.jsut.web.service.UserService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 15:12
 */
@Controller
@Slf4j
@RequestMapping("/curriculum")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CurriculumController {

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private CurriculumService curriculumService;

    @GetMapping("/first")
    public String first(Model model){
        List<College> colleges = collegeService.selectByCollege(User.COLLEGE);
        model.addAttribute("colleges",colleges);
        return "curriculum";
    }


    @ResponseBody
    @GetMapping("/select/{grade}/{term}")
    public Curriculum select (@PathVariable("grade")String grade,@PathVariable("term")String term){
        Curriculum curriculum = curriculumService.select(grade,term);
        return curriculum;
    }

    @PostMapping("/insert")
    public String insert(Curriculum curriculum,Model model){
        if(curriculumService.select(curriculum.getGrade(),curriculum.getTerm())==null){
            curriculumService.insert(curriculum);
        }else {
            curriculumService.update(curriculum);
        }

        List<College> colleges = collegeService.selectByCollege(User.COLLEGE);
        model.addAttribute("colleges",colleges);
        return "curriculum";
    }
}
