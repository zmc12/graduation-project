package com.jsut.web.controller;

import com.jsut.web.pojo.College;
import com.jsut.web.pojo.Dom;
import com.jsut.web.service.CollegeService;
import com.jsut.web.service.DomService;
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
 * @date 2021/1/20 10:18
 */
@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/dom")
@CrossOrigin(origins = "*",maxAge = 3600)
public class DomController {

    @Autowired
    private DomService domService;

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/first")
    public String first(Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        List<Dom>list=domService.selectAll();
        model.addAttribute("doms",list);


        List<College> colleges = collegeService.selectByCollege(cookies[1].getValue());
        model.addAttribute("colleges",colleges);
        return "dom";
    }

    @ResponseBody
    @GetMapping("/select")
    public List<Dom> select(@RequestParam("grade")String grade,@RequestParam("term")String term){
        List<Dom> doms = domService.select(grade, term);
        //System.out.println(doms.toString());
        return doms;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id")Integer id,Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        domService.deleteById(id);
        List<Dom>list=domService.selectAll();
        model.addAttribute("doms",list);

        List<College> colleges = collegeService.selectByCollege(cookies[1].getValue());
        model.addAttribute("colleges",colleges);
        return "dom";
    }

    @PostMapping("/insert")
    public String insert(Dom dom,Model model, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();

        domService.insert(dom);
        List<Dom>list=domService.selectAll();
        model.addAttribute("doms",list);

        List<College> colleges = collegeService.selectByCollege(cookies[1].getValue());
        model.addAttribute("colleges",colleges);
        return "dom";
    }

    @PostMapping("/update")
    public String update(Model model, Dom dom, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        System.out.println(dom.toString());
        domService.updateById(dom);
        List<Dom> list=domService.selectAll();
        model.addAttribute("doms",list);

        List<College> colleges = collegeService.selectByCollege(cookies[1].getValue());
        model.addAttribute("colleges",colleges);
        return "dom";
    }
}
