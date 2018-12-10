package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class Praise {
    private Integer id;

    private String praiseCommentator;

    private String praiseCommentatorImage;

    private String praiseCommentContent;

    private String praiseCommentPicture;

    private Date praiseCommentTime;

    private String praisePraise;

    private Integer praiseHouseid;

    private Integer praiseFatherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPraiseCommentator() {
        return praiseCommentator;
    }

    public void setPraiseCommentator(String praiseCommentator) {
        this.praiseCommentator = praiseCommentator == null ? null : praiseCommentator.trim();
    }

    public String getPraiseCommentatorImage() {
        return praiseCommentatorImage;
    }

    public void setPraiseCommentatorImage(String praiseCommentatorImage) {
        this.praiseCommentatorImage = praiseCommentatorImage == null ? null : praiseCommentatorImage.trim();
    }

    public String getPraiseCommentContent() {
        return praiseCommentContent;
    }

    public void setPraiseCommentContent(String praiseCommentContent) {
        this.praiseCommentContent = praiseCommentContent == null ? null : praiseCommentContent.trim();
    }

    public String getPraiseCommentPicture() {
        return praiseCommentPicture;
    }

    public void setPraiseCommentPicture(String praiseCommentPicture) {
        this.praiseCommentPicture = praiseCommentPicture == null ? null : praiseCommentPicture.trim();
    }

    public Date getPraiseCommentTime() {
        return praiseCommentTime;
    }

    public void setPraiseCommentTime(Date praiseCommentTime) {
        this.praiseCommentTime = praiseCommentTime;
    }

    public String getPraisePraise() {
        return praisePraise;
    }

    public void setPraisePraise(String praisePraise) {
        this.praisePraise = praisePraise == null ? null : praisePraise.trim();
    }

    public Integer getPraiseHouseid() {
        return praiseHouseid;
    }

    public void setPraiseHouseid(Integer praiseHouseid) {
        this.praiseHouseid = praiseHouseid;
    }

    public Integer getPraiseFatherId() {
        return praiseFatherId;
    }

    public void setPraiseFatherId(Integer praiseFatherId) {
        this.praiseFatherId = praiseFatherId;
    }
}