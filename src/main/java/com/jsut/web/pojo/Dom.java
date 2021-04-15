package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:12
 */
@EnableAutoConfiguration

public class Dom implements Serializable {
    private Integer id;
    private String number;
    private Integer score;
    private String students;
    private String fix;
    private String process;
    private String grade;
    private String term;


    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", score=" + score +
                ", students='" + students + '\'' +
                ", fix='" + fix + '\'' +
                ", process='" + process + '\'' +
                ", grade='" + grade + '\'' +
                ", term='" + term + '\'' +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getFix() {
        return fix;
    }

    public void setFix(String fix) {
        this.fix = fix;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }
}
