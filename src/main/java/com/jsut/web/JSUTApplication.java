package com.jsut.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author ZhangMinCong
 * @date 2020/12/18 10:57
 */
@SpringBootApplication
public class JSUTApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app){

        return app.sources(JSUTApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(JSUTApplication.class,args);
    }
}
