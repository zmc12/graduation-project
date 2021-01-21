package com.jsut.web.controller;

import com.jsut.web.pojo.Market;
import com.jsut.web.service.MarketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 13:43
 */
@Controller
@Slf4j
@RequestMapping("/market")
public class MarketController {

    @Autowired
    private MarketService marketService;

    @GetMapping("/first")
    public String first(Model model){
        List<Market> list=marketService.selectAll();
        model.addAttribute("markets",list);
        return "market";
    }



    @PostMapping("/insert")
    public String insert(Market market,Model model){
        marketService.insert(market);
        List<Market> list=marketService.selectAll();
        model.addAttribute("markets",list);
        return "market";
    }
}
