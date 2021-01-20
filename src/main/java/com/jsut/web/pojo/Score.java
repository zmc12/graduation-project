package com.jsut.web.pojo;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:18
 */
public class Score implements Serializable {

    private Integer id;
    private Integer score;
    private String subject;

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", score=" + score +
                ", subject='" + subject + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
