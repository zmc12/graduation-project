package com.jsut.web.controller;

import com.jsut.web.pojo.Dom;
import com.jsut.web.pojo.Notice;
import com.jsut.web.service.DomService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 10:18
 */

@Controller
@Slf4j
@RequestMapping("/dom")
public class DomController {

    @Autowired
    private DomService domService;

    @GetMapping("/first")
    public String first(Model model){
        List<Dom>list=domService.selectAll();
        model.addAttribute("doms",list);
        return "dom";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id")Integer id,Model model){
        domService.deleteById(id);
        List<Dom>list=domService.selectAll();
        model.addAttribute("doms",list);
        return "dom";
    }

    @PostMapping("/insert")
    public String insert(Dom dom,Model model){

        domService.insert(dom);
        List<Dom>list=domService.selectAll();
        model.addAttribute("doms",list);
        return "dom";
    }

    @PostMapping("/update")
    public String update(Model model, Dom dom){

        domService.updateById(dom);
        List<Dom> list=domService.selectAll();
        model.addAttribute("doms",list);
        return "dom";
    }
}
