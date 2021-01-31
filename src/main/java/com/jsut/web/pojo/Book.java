package com.jsut.web.pojo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:08
 */
@EnableAutoConfiguration

public class Book implements Serializable {

    private Integer id;
    private Integer amount;
    private String bookName;
    private String time;
    private String studentName;

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", amount=" + amount +
                ", bookName='" + bookName + '\'' +
                ", time='" + time + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
