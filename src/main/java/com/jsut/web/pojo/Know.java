package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/4/25 15:09
 */
@EnableAutoConfiguration
public class Know implements Serializable {

    private Integer id;
    private Integer nid;
    private String name;
    private String situation;

    public Know() {
    }

    public Know(Integer nid, String name, String situation) {
        this.nid = nid;
        this.name = name;
        this.situation = situation;
    }

    public Know(Integer id, Integer nid, String name, String situation) {
        this.id = id;
        this.nid = nid;
        this.name = name;
        this.situation = situation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Know{" +
                "id=" + id +
                ", nid=" + nid +
                ", name='" + name + '\'' +
                ", situation='" + situation + '\'' +
                '}';
    }
}
