package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class NegativeComment {
    private Integer userid;

    private String negativeCommentPicture;

    private Date negativeCommentTime;

    private String negativePraise;

    private Integer negativeHouseid;

    private Integer negativeFatherId;

    private String negativeCommentContent;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNegativeCommentPicture() {
        return negativeCommentPicture;
    }

    public void setNegativeCommentPicture(String negativeCommentPicture) {
        this.negativeCommentPicture = negativeCommentPicture == null ? null : negativeCommentPicture.trim();
    }

    public Date getNegativeCommentTime() {
        return negativeCommentTime;
    }

    public void setNegativeCommentTime(Date negativeCommentTime) {
        this.negativeCommentTime = negativeCommentTime;
    }

    public String getNegativePraise() {
        return negativePraise;
    }

    public void setNegativePraise(String negativePraise) {
        this.negativePraise = negativePraise == null ? null : negativePraise.trim();
    }

    public Integer getNegativeHouseid() {
        return negativeHouseid;
    }

    public void setNegativeHouseid(Integer negativeHouseid) {
        this.negativeHouseid = negativeHouseid;
    }

    public Integer getNegativeFatherId() {
        return negativeFatherId;
    }

    public void setNegativeFatherId(Integer negativeFatherId) {
        this.negativeFatherId = negativeFatherId;
    }

    public String getNegativeCommentContent() {
        return negativeCommentContent;
    }

    public void setNegativeCommentContent(String negativeCommentContent) {
        this.negativeCommentContent = negativeCommentContent == null ? null : negativeCommentContent.trim();
    }
}