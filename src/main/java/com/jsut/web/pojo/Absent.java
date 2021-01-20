package com.jsut.web.pojo;

import java.io.Serializable;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 16:00
 */
public class Absent implements Serializable {

    private Integer id;
    private String name;
    private String reason;
    private String startTime;
    private String endTime;

    @Override
    public String toString() {
        return "absent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
