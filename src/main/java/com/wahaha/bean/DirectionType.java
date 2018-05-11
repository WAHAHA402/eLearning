package com.wahaha.bean;

public class DirectionType {
    private Integer id;

    private String directiontype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectiontype() {
        return directiontype;
    }

    public void setDirectiontype(String directiontype) {
        this.directiontype = directiontype == null ? null : directiontype.trim();
    }
}