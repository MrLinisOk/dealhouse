package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class NewHouseDetails {
    private Integer id;

    private String newDetailsName;

    private String newDetailsRotationpicture;

    private String newDetailsDecorationsituation;

    private String newDetailsStatus;

    private String newDetailsHousingtype;

    private Integer houseTypeId;

    private Double newDetailsAverageprice;

    private Date newDetailsOpeningtime;

    private String newDetailsAddress;

    private Integer newDetailsRealestate;

    private Integer newDetailsComment;

    private Integer newDetailsListid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewDetailsName() {
        return newDetailsName;
    }

    public void setNewDetailsName(String newDetailsName) {
        this.newDetailsName = newDetailsName == null ? null : newDetailsName.trim();
    }

    public String getNewDetailsRotationpicture() {
        return newDetailsRotationpicture;
    }

    public void setNewDetailsRotationpicture(String newDetailsRotationpicture) {
        this.newDetailsRotationpicture = newDetailsRotationpicture == null ? null : newDetailsRotationpicture.trim();
    }

    public String getNewDetailsDecorationsituation() {
        return newDetailsDecorationsituation;
    }

    public void setNewDetailsDecorationsituation(String newDetailsDecorationsituation) {
        this.newDetailsDecorationsituation = newDetailsDecorationsituation == null ? null : newDetailsDecorationsituation.trim();
    }

    public String getNewDetailsStatus() {
        return newDetailsStatus;
    }

    public void setNewDetailsStatus(String newDetailsStatus) {
        this.newDetailsStatus = newDetailsStatus == null ? null : newDetailsStatus.trim();
    }

    public String getNewDetailsHousingtype() {
        return newDetailsHousingtype;
    }

    public void setNewDetailsHousingtype(String newDetailsHousingtype) {
        this.newDetailsHousingtype = newDetailsHousingtype == null ? null : newDetailsHousingtype.trim();
    }

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public Double getNewDetailsAverageprice() {
        return newDetailsAverageprice;
    }

    public void setNewDetailsAverageprice(Double newDetailsAverageprice) {
        this.newDetailsAverageprice = newDetailsAverageprice;
    }

    public Date getNewDetailsOpeningtime() {
        return newDetailsOpeningtime;
    }

    public void setNewDetailsOpeningtime(Date newDetailsOpeningtime) {
        this.newDetailsOpeningtime = newDetailsOpeningtime;
    }

    public String getNewDetailsAddress() {
        return newDetailsAddress;
    }

    public void setNewDetailsAddress(String newDetailsAddress) {
        this.newDetailsAddress = newDetailsAddress == null ? null : newDetailsAddress.trim();
    }

    public Integer getNewDetailsRealestate() {
        return newDetailsRealestate;
    }

    public void setNewDetailsRealestate(Integer newDetailsRealestate) {
        this.newDetailsRealestate = newDetailsRealestate;
    }

    public Integer getNewDetailsComment() {
        return newDetailsComment;
    }

    public void setNewDetailsComment(Integer newDetailsComment) {
        this.newDetailsComment = newDetailsComment;
    }

    public Integer getNewDetailsListid() {
        return newDetailsListid;
    }

    public void setNewDetailsListid(Integer newDetailsListid) {
        this.newDetailsListid = newDetailsListid;
    }
}