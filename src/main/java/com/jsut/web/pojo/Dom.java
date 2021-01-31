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


    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", score=" + score +
                ", students='" + students + '\'' +
                '}';
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
