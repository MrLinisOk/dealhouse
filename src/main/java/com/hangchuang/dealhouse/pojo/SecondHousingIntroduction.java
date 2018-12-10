package com.hangchuang.dealhouse.pojo;

public class SecondHousingIntroduction {
    private Integer id;

    private String houseType;

    private String communityIntroduction;

    private String saleDetails;

    private String coreSellingPoint;

    private String housingSourceCharacteristics;

    private Integer listHouseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getCommunityIntroduction() {
        return communityIntroduction;
    }

    public void setCommunityIntroduction(String communityIntroduction) {
        this.communityIntroduction = communityIntroduction == null ? null : communityIntroduction.trim();
    }

    public String getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(String saleDetails) {
        this.saleDetails = saleDetails == null ? null : saleDetails.trim();
    }

    public String getCoreSellingPoint() {
        return coreSellingPoint;
    }

    public void setCoreSellingPoint(String coreSellingPoint) {
        this.coreSellingPoint = coreSellingPoint == null ? null : coreSellingPoint.trim();
    }

    public String getHousingSourceCharacteristics() {
        return housingSourceCharacteristics;
    }

    public void setHousingSourceCharacteristics(String housingSourceCharacteristics) {
        this.housingSourceCharacteristics = housingSourceCharacteristics == null ? null : housingSourceCharacteristics.trim();
    }

    public Integer getListHouseid() {
        return listHouseid;
    }

    public void setListHouseid(Integer listHouseid) {
        this.listHouseid = listHouseid;
    }
}