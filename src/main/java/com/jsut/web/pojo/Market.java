package com.jsut.web.pojo;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:15
 */
public class Market implements Serializable {

    private Integer id;
    private String submitter;
    private String text;

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", submitter='" + submitter + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
