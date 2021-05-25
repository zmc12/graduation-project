package com.jsut.web;

import com.jsut.web.mapper.AbsentMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZhangMinCong
 * @date 2020/12/18 10:57
 */
@EnableScheduling
@SpringBootApplication
@MapperScan("com.jsut.web.mapper")
public class JSUTApplication extends SpringBootServletInitializer {

    @Autowired
    private AbsentMapper absentMapper;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app){

        return app.sources(JSUTApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(JSUTApplication.class,args);
    }

    @Scheduled(cron = "1 * * * * *")
    public void setResult(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(new Date());
        absentMapper.setResult(time);
    }
}
