package com.jsut.web.pojo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/5/25 12:45
 */

@EnableAutoConfiguration
public class Course implements Serializable {

    private Integer id;
    private String names;
    private String subject;
    private String name;
    private String teacher;
    private String point;
    private Integer flag;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", point='" + point + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
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

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
