package com.jsut.web.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsut.web.pojo.*;
import com.jsut.web.service.CollegeService;
import com.jsut.web.service.CourseService;
import com.jsut.web.service.ScoreService;
import com.jsut.web.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 10:43
 */
@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/score")
@CrossOrigin(origins = "*",maxAge = 3600)
public class ScoreController {

    @Autowired
    private ScoreService scoreService;
    @Autowired
    private StudentService studentService;

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private CourseService courseService;


    @RequestMapping("/search/first")
    public String searchFirst(Model model, HttpServletRequest request){

        List<College> colleges = collegeService.selectByCollege();
        List<Score> scoreList = scoreService.selectSubject();
        model.addAttribute("colleges",colleges);
        model.addAttribute("scores",scoreList);
        return "scoreSearch";
    }

    @RequestMapping("/insert/first")
    public String insertFirst(Model model, HttpServletRequest request){
        List<College> colleges = collegeService.selectByCollege();
        List<Course> courses = courseService.selectAll();
        model.addAttribute("courses",courses);
        model.addAttribute("colleges",colleges);
        return "scoreInsert";
    }


    @ResponseBody
    @GetMapping("/select")
    public List<Student> select(@RequestParam("grade")String grade){

        List<Student> students=studentService.selectByGrade(grade);
        return students;
    }

    @ResponseBody
    @GetMapping("/selectScore")
    public List<Score> selectScore(@RequestParam("grade")String grade,@RequestParam("subject")String subject){
        List<Score> scores=scoreService.selectByGrade(grade,subject);
        return scores;
    }



    @ResponseBody
    @PostMapping("/insert")
    public ResultCode insert(@RequestParam("scores") String scores,Model model, HttpServletRequest request) throws IOException {
        Object college = request.getSession().getAttribute("college");
        ObjectMapper mapper = new ObjectMapper();
        JavaType jt = mapper.getTypeFactory().constructParametricType(ArrayList.class, Score.class);
        List<Score> sc =  (List<Score>)mapper.readValue(scores, jt);


        for(Score scoreList:sc){
            if(scoreService.ifHas(scoreList) == null){
                scoreService.insert(scoreList);

            }else{
                scoreService.updateById(scoreList);
            }
        }

        List<Student> students=studentService.selectAll(college.toString());
        model.addAttribute("students",students);


        return new ResultCode(200,"保存成绩成功");
    }



}
