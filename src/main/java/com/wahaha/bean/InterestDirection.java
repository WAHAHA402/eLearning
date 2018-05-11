package com.wahaha.bean;

public class InterestDirection {
    private String userid;

    private Integer direction1;

    private Integer direction2;

    private Integer direction3;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getDirection1() {
        return direction1;
    }

    public void setDirection1(Integer direction1) {
        this.direction1 = direction1;
    }

    public Integer getDirection2() {
        return direction2;
    }

    public void setDirection2(Integer direction2) {
        this.direction2 = direction2;
    }

    public Integer getDirection3() {
        return direction3;
    }

    public void setDirection3(Integer direction3) {
        this.direction3 = direction3;
    }
}