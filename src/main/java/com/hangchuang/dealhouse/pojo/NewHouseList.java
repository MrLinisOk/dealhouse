package com.hangchuang.dealhouse.pojo;

public class NewHouseList {
    private Integer id;

    private String newHouseTitle;

    private Integer newHouseMeasure;

    private String newHouseRegion;

    private String newHouseHousingid;

    private Double newHouseAverageprice;

    private String newHouseGrade;

    private Integer countryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewHouseTitle() {
        return newHouseTitle;
    }

    public void setNewHouseTitle(String newHouseTitle) {
        this.newHouseTitle = newHouseTitle == null ? null : newHouseTitle.trim();
    }

    public Integer getNewHouseMeasure() {
        return newHouseMeasure;
    }

    public void setNewHouseMeasure(Integer newHouseMeasure) {
        this.newHouseMeasure = newHouseMeasure;
    }

    public String getNewHouseRegion() {
        return newHouseRegion;
    }

    public void setNewHouseRegion(String newHouseRegion) {
        this.newHouseRegion = newHouseRegion == null ? null : newHouseRegion.trim();
    }

    public String getNewHouseHousingid() {
        return newHouseHousingid;
    }

    public void setNewHouseHousingid(String newHouseHousingid) {
        this.newHouseHousingid = newHouseHousingid == null ? null : newHouseHousingid.trim();
    }

    public Double getNewHouseAverageprice() {
        return newHouseAverageprice;
    }

    public void setNewHouseAverageprice(Double newHouseAverageprice) {
        this.newHouseAverageprice = newHouseAverageprice;
    }

    public String getNewHouseGrade() {
        return newHouseGrade;
    }

    public void setNewHouseGrade(String newHouseGrade) {
        this.newHouseGrade = newHouseGrade == null ? null : newHouseGrade.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}