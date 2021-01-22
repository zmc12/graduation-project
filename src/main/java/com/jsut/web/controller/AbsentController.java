package com.jsut.web.controller;

import com.jsut.web.pojo.Absent;
import com.jsut.web.pojo.ResultCode;
import com.jsut.web.service.AbsentService;
import com.jsut.web.utils.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 9:32
 */

@Controller
@Slf4j
@RequestMapping("/absent")
public class AbsentController {

    @Autowired
    private AbsentService absentService;

    @GetMapping("/first")
    public String first(Model model){
        List<Absent> list=absentService.selectAll(User.COLLEGE);
        model.addAttribute("absents",list);

        return "absent";
    }


    @ResponseBody
    @PutMapping("/update")
    public ResultCode update(@RequestParam("id")String id, @RequestParam("result")String result){

        int i=absentService.updateById(id,result);
        if(i==1){
            return new ResultCode(200,"提交成功");
        }else {
            return new ResultCode(200,"提交失败");
        }


    }
}
