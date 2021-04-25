package com.jsut.web.controller;

import com.jsut.web.pojo.Market;
import com.jsut.web.service.MarketService;
import com.jsut.web.utils.UploadUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 13:43
 */
@EnableAutoConfiguration
@Controller
@Slf4j
@RequestMapping("/market")
@CrossOrigin(origins = "*",maxAge = 3600)
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
    public String insert(Market market, Model model) throws IOException {
        MultipartFile imgFile = market.getFile();
        // 拿到文件名
        String filename = imgFile.getOriginalFilename();

        String staticPath = ClassUtils.getDefaultClassLoader().getResource("static").getPath();
//        // 存放上传图片的文件夹
//        File fileDir = UploadUtils.getImgDirFile();
//        // 输出文件夹绝对路径  -- 这里的绝对路径是相当于当前项目的路径而不是“容器”路径
//        System.out.println(fileDir.getAbsolutePath());

        // 构建真实的文件路径
        File newFile = new File(staticPath+"/images"+ File.separator + filename);
        System.out.println(newFile.getAbsolutePath());

        try {


            // 上传图片到 -》 “绝对路径”
            imgFile.transferTo(newFile);




        } catch (IOException e) {
            imgFile.transferTo(newFile);
            e.printStackTrace();
        }



//        //获取项目classes/static的地址
//        String staticPath = ClassUtils.getDefaultClassLoader().getResource("static").getPath();
//        String fileName = file.getOriginalFilename();  //获取文件名
//
//        // 图片存储目录及图片名称
//        String url_path = "images" + File.separator + fileName;
//        //图片保存路径
//        String savePath = staticPath + File.separator + url_path;
//        System.out.println("图片保存地址："+savePath);
//        // 访问路径=静态资源路径+文件目录路径
//        String visitPath ="static/" + url_path;
//        System.out.println("图片访问uri："+visitPath);
//
//        File saveFile = new File(savePath);
//        if (!saveFile.exists()){
//            saveFile.mkdirs();
//        }
//        try {
//            file.transferTo(saveFile);  //将临时存储的文件移动到真实存储路径下
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        market.setPath(filename);
        marketService.insert(market);
        List<Market> list=marketService.selectAll();
        model.addAttribute("markets",list);
        return "market";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("id")Integer id){
        marketService.deleteById(id);
        List<Market> list=marketService.selectAll();
        model.addAttribute("markets",list);
        return "market";
    }

    @PostMapping("/update")
    public String update(Model model,Market market){

        marketService.updateById(market);
        List<Market> list=marketService.selectAll();
        model.addAttribute("markets",list);
        return "market";
    }
}
