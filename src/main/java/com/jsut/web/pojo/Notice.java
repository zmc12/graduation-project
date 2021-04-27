package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:16
 */
@EnableAutoConfiguration

public class Notice implements Serializable {

    private Integer id;
    private String text;
    private String grade;
    private String name;
    private String title;

    private String[] grades;


    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getGrades() {
        return grades;
    }

    public void setGrades(String[] grades) {
        this.grades = grades;
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


}
