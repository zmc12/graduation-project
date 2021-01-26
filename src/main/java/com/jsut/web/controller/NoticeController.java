package com.jsut.web.controller;

import com.jsut.web.pojo.College;
import com.jsut.web.pojo.Market;
import com.jsut.web.pojo.Notice;
import com.jsut.web.service.CollegeService;
import com.jsut.web.service.NoticeService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 13:32
 */
@Controller
@Slf4j
@RequestMapping("/notice")
@CrossOrigin(origins = "*",maxAge = 3600)
public class NoticeController {


    @Autowired
    private NoticeService noticeService;

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/first")
    public String first(Model model){
        List <College> colleges= collegeService.selectByCollege(User.COLLEGE);
        List<Notice> list=noticeService.selectAll(User.Name);
        model.addAttribute("notices",list);
        model.addAttribute("colleges",colleges);
        return "notice";
    }

    @GetMapping("/delete")
    public String delete(Model model,@RequestParam("id")Integer id){
        noticeService.deleteById(id);
        List<Notice> list=noticeService.selectAll(User.Name);
        model.addAttribute("notices",list);
        return "notice";
    }


    @PostMapping("/insert")
    public String insert(Notice notice,Model model){
        notice.setName(User.Name);
        System.out.println(notice.toString());
        noticeService.insert(notice);
        List<Notice> list=noticeService.selectAll(User.Name);
        model.addAttribute("notices",list);
        return "notice";
    }

    @PostMapping("/update")
    public String update(Model model,Notice notice){
        notice.setName(User.Name);
        System.out.println(notice.toString());
        noticeService.updateById(notice);
        List<Notice> list=noticeService.selectAll(User.Name);
        model.addAttribute("notices",list);
        return "notice";
    }
}
