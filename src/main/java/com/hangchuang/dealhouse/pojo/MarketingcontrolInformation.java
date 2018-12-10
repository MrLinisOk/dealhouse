package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class MarketingcontrolInformation {
    private Integer id;

    private String marketingcontrolTitle;

    private Date marketingcontrolTime;

    private String marketingcontrolContent;

    private String marketingcontrolPicture;

    private Integer marketingcontrolHouseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarketingcontrolTitle() {
        return marketingcontrolTitle;
    }

    public void setMarketingcontrolTitle(String marketingcontrolTitle) {
        this.marketingcontrolTitle = marketingcontrolTitle == null ? null : marketingcontrolTitle.trim();
    }

    public Date getMarketingcontrolTime() {
        return marketingcontrolTime;
    }

    public void setMarketingcontrolTime(Date marketingcontrolTime) {
        this.marketingcontrolTime = marketingcontrolTime;
    }

    public String getMarketingcontrolContent() {
        return marketingcontrolContent;
    }

    public void setMarketingcontrolContent(String marketingcontrolContent) {
        this.marketingcontrolContent = marketingcontrolContent == null ? null : marketingcontrolContent.trim();
    }

    public String getMarketingcontrolPicture() {
        return marketingcontrolPicture;
    }

    public void setMarketingcontrolPicture(String marketingcontrolPicture) {
        this.marketingcontrolPicture = marketingcontrolPicture == null ? null : marketingcontrolPicture.trim();
    }

    public Integer getMarketingcontrolHouseid() {
        return marketingcontrolHouseid;
    }

    public void setMarketingcontrolHouseid(Integer marketingcontrolHouseid) {
        this.marketingcontrolHouseid = marketingcontrolHouseid;
    }
}