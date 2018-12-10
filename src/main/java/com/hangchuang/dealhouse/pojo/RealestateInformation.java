package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class RealestateInformation {
    private Integer id;

    private String realestateTitle;

    private Date realestateTime;

    private String realestateContent;

    private String realestatePicture;

    private Integer realestateHouseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealestateTitle() {
        return realestateTitle;
    }

    public void setRealestateTitle(String realestateTitle) {
        this.realestateTitle = realestateTitle == null ? null : realestateTitle.trim();
    }

    public Date getRealestateTime() {
        return realestateTime;
    }

    public void setRealestateTime(Date realestateTime) {
        this.realestateTime = realestateTime;
    }

    public String getRealestateContent() {
        return realestateContent;
    }

    public void setRealestateContent(String realestateContent) {
        this.realestateContent = realestateContent == null ? null : realestateContent.trim();
    }

    public String getRealestatePicture() {
        return realestatePicture;
    }

    public void setRealestatePicture(String realestatePicture) {
        this.realestatePicture = realestatePicture == null ? null : realestatePicture.trim();
    }

    public Integer getRealestateHouseid() {
        return realestateHouseid;
    }

    public void setRealestateHouseid(Integer realestateHouseid) {
        this.realestateHouseid = realestateHouseid;
    }
}