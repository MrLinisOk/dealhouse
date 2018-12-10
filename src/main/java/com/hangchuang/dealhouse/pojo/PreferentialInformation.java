package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class PreferentialInformation {
    private Integer id;

    private String preferentialTitle;

    private Date preferentialTime;

    private String preferentialContent;

    private String preferentialPicture;

    private Integer preferentialHouseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreferentialTitle() {
        return preferentialTitle;
    }

    public void setPreferentialTitle(String preferentialTitle) {
        this.preferentialTitle = preferentialTitle == null ? null : preferentialTitle.trim();
    }

    public Date getPreferentialTime() {
        return preferentialTime;
    }

    public void setPreferentialTime(Date preferentialTime) {
        this.preferentialTime = preferentialTime;
    }

    public String getPreferentialContent() {
        return preferentialContent;
    }

    public void setPreferentialContent(String preferentialContent) {
        this.preferentialContent = preferentialContent == null ? null : preferentialContent.trim();
    }

    public String getPreferentialPicture() {
        return preferentialPicture;
    }

    public void setPreferentialPicture(String preferentialPicture) {
        this.preferentialPicture = preferentialPicture == null ? null : preferentialPicture.trim();
    }

    public Integer getPreferentialHouseid() {
        return preferentialHouseid;
    }

    public void setPreferentialHouseid(Integer preferentialHouseid) {
        this.preferentialHouseid = preferentialHouseid;
    }
}