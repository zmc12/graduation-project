package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:15
 */
@EnableAutoConfiguration

public class Market implements Serializable {

    private Integer id;
    private String text;
    private String contact;

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
}
