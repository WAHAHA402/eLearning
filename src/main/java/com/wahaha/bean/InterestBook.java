package com.wahaha.bean;

public class InterestBook {
    private String userid;

    private String book1;

    private String book2;

    private String book3;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getBook1() {
        return book1;
    }

    public void setBook1(String book1) {
        this.book1 = book1 == null ? null : book1.trim();
    }

    public String getBook2() {
        return book2;
    }

    public void setBook2(String book2) {
        this.book2 = book2 == null ? null : book2.trim();
    }

    public String getBook3() {
        return book3;
    }

    public void setBook3(String book3) {
        this.book3 = book3 == null ? null : book3.trim();
    }
}