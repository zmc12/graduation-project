package com.jsut.web.pojo;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 15:54
 */
public class Teacher implements Serializable {

    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String college;

    public Teacher(Integer id, String name, String userName, String password, String college) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.college = college;
    }

    public Teacher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
