package com.jsut.web.controller;

import com.jsut.web.pojo.Score;
import com.jsut.web.pojo.Student;
import com.jsut.web.service.ScoreService;
import com.jsut.web.service.StudentService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 10:43
 */

@Controller
@Slf4j
@RequestMapping("/score")
@CrossOrigin(origins = "*",maxAge = 3600)
public class ScoreController {

    @Autowired
    private ScoreService scoreService;
    @Autowired
    private StudentService studentService;

    String name=new String();

    @RequestMapping("/first")
    public String first(Model model){
        List<Student> students=studentService.selectAll(User.COLLEGE);
        model.addAttribute("students",students);
        return "score";
    }

    @GetMapping("/select")
    public String select(Model model, @RequestParam("name")String name){
        this.name=name;
        List<Score> scores=scoreService.selectByName(name);
        List<Student> students=studentService.selectAll(User.COLLEGE);
        model.addAttribute("students",students);
        model.addAttribute("scores",scores);
        return "score";
    }

    @GetMapping("/delete")
    public String delete(Model model,@RequestParam("id")Integer id){
        scoreService.deleteById(id);
        List<Score> scores=scoreService.selectByName(this.name);
        List<Student> students=studentService.selectAll(User.COLLEGE);
        model.addAttribute("students",students);
        model.addAttribute("scores",scores);
        return "score";
    }

    @PostMapping("/insert")
    public String insert(Score score,Model model){

        scoreService.insert(score);
        List<Score> scores=scoreService.selectByName(this.name);
        List<Student> students=studentService.selectAll(User.COLLEGE);
        model.addAttribute("students",students);
        model.addAttribute("scores",scores);
        return "score";
    }

    @PostMapping("/update")
    public String update(Score score,Model model){

        scoreService.updateById(score);
        List<Score> scores=scoreService.selectByName(this.name);
        List<Student> students=studentService.selectAll(User.COLLEGE);
        model.addAttribute("students",students);
        model.addAttribute("scores",scores);
        return "score";
    }

}
