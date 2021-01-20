package com.jsut.web.pojo;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:16
 */
public class Notice implements Serializable {

    private Integer id;
    private String text;
    private String grade;
    private String stuation;

    @Override
    public String toString() {
        return "notice{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", grade='" + grade + '\'' +
                ", stuation='" + stuation + '\'' +
                '}';
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

    public String getStuation() {
        return stuation;
    }

    public void setStuation(String stuation) {
        this.stuation = stuation;
    }
}
