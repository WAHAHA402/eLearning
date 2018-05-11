package com.wahaha.bean;

public class SearchContent {
    private String userid;

    private Integer frontendfoundation;

    private Integer frontendadvance;

    private Integer backend;

    private Integer mobiledevelop;

    private Integer database666;

    private Integer recenttechitem;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getFrontendfoundation() {
        return frontendfoundation;
    }

    public void setFrontendfoundation(Integer frontendfoundation) {
        this.frontendfoundation = frontendfoundation;
    }

    public Integer getFrontendadvance() {
        return frontendadvance;
    }

    public void setFrontendadvance(Integer frontendadvance) {
        this.frontendadvance = frontendadvance;
    }

    public Integer getBackend() {
        return backend;
    }

    public void setBackend(Integer backend) {
        this.backend = backend;
    }

    public Integer getMobiledevelop() {
        return mobiledevelop;
    }

    public void setMobiledevelop(Integer mobiledevelop) {
        this.mobiledevelop = mobiledevelop;
    }

    public Integer getDatabase666() {
        return database666;
    }

    public void setDatabase666(Integer database666) {
        this.database666 = database666;
    }

    public Integer getRecenttechitem() {
        return recenttechitem;
    }

    public void setRecenttechitem(Integer recenttechitem) {
        this.recenttechitem = recenttechitem;
    }
}