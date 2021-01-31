package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:16
 */
@EnableAutoConfiguration

public class Notice implements Serializable {

    private Integer id;
    private String text;
    private String grade;
    private String situation;
    private String name;


    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", grade='" + grade + '\'' +
                ", situation='" + situation + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
