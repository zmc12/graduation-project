package com.jsut.web.controller;

import com.jsut.web.pojo.Sign;
import com.jsut.web.service.SignService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 15:23
 */
@Controller
@Slf4j
@RequestMapping("/sign")
@CrossOrigin(origins = "*",maxAge = 3600)
public class SignController {

    @Autowired
    private SignService signService;

    @GetMapping("/first")
    public String first(Model model) {
        List<Sign> list1=signService.selectSign(User.COLLEGE);
        List<Sign> list2= signService.selctNoSign(User.COLLEGE);
        model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);
        return "sign";

    }
}
