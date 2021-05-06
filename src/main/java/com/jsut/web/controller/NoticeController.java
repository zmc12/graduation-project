package com.jsut.web.controller;

import com.jsut.web.pojo.*;
import com.jsut.web.service.CollegeService;
import com.jsut.web.service.KnowService;
import com.jsut.web.service.NoticeService;
import com.jsut.web.service.StudentService;
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
 * @date 2021/1/20 13:32
 */
@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/notice")
@CrossOrigin(origins = "*",maxAge = 3600)
public class NoticeController {


    @Autowired
    private NoticeService noticeService;

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private KnowService knowService;

    @GetMapping("/first")
    public String first(Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        List <College> colleges= collegeService.selectByCollege(cookies[1].getValue());
        List<Notice> list=noticeService.selectAll(cookies[0].getValue());
        model.addAttribute("notices",list);
        model.addAttribute("colleges",colleges);
        return "notice";
    }

    @GetMapping("/delete")
    public String delete(Model model,@RequestParam("id")Integer id, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        noticeService.deleteById(id);
        knowService.deleteById(id);
        List <College> colleges= collegeService.selectByCollege(cookies[1].getValue());
        List<Notice> list=noticeService.selectAll(cookies[1].getValue());
        model.addAttribute("notices",list);
        model.addAttribute("colleges",colleges);
        return "notice";
    }


    @PostMapping("/insert")
    public String insert(Notice notice,Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(int i=0;i<notice.getGrades().length;i++){
            notice.setName(cookies[0].getName());
            notice.setGrade(notice.getGrades()[i]);
            noticeService.insert(notice);
            Integer id = notice.getId();
            List<Student> students = studentService.selectByGrade(notice.getGrade());
            for(int j=0;j<students.size();j++){
                knowService.insert(new Know(id,students.get(j).getName(),"未确认"));
            }
        }

        List <College> colleges= collegeService.selectByCollege(cookies[1].getValue());
        List<Notice> list=noticeService.selectAll(cookies[0].getValue());
        model.addAttribute("notices",list);
        model.addAttribute("colleges",colleges);
        return "notice";
    }

    @PostMapping("/update")
    public String update(Model model,Notice notice, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        notice.setName(cookies[0].getValue());
        noticeService.updateById(notice);

        List <College> colleges= collegeService.selectByCollege(cookies[1].getValue());
        List<Notice> list=noticeService.selectAll(cookies[0].getValue());
        model.addAttribute("notices",list);
        model.addAttribute("colleges",colleges);
        return "notice";
    }

    @ResponseBody
    @GetMapping("/selectStudent")
    public List<Know> selectStudent(@RequestParam("id")Integer id,@RequestParam("grade")String grade){

        List<Know> knows = knowService.selectStudent(id,grade);

        return knows;

    }
}
