package com.hangchuang.dealhouse.pojo;

public class RentingHouse {
    private Integer id;

    private String secondHouseTitle;

    private Integer secondHouseHuxing;

    private Integer secondHouseMeasure;

    private String secondHouseOrientation;

    private String secondHouseRegion;

    private String advantageid;

    private Double secondHouseTotalPrice;

    private String secondHouseGrade;

    private Integer countryId;

    private String floor;

    private String totalfloor;

    private String lift;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSecondHouseTitle() {
        return secondHouseTitle;
    }

    public void setSecondHouseTitle(String secondHouseTitle) {
        this.secondHouseTitle = secondHouseTitle == null ? null : secondHouseTitle.trim();
    }

    public Integer getSecondHouseHuxing() {
        return secondHouseHuxing;
    }

    public void setSecondHouseHuxing(Integer secondHouseHuxing) {
        this.secondHouseHuxing = secondHouseHuxing;
    }

    public Integer getSecondHouseMeasure() {
        return secondHouseMeasure;
    }

    public void setSecondHouseMeasure(Integer secondHouseMeasure) {
        this.secondHouseMeasure = secondHouseMeasure;
    }

    public String getSecondHouseOrientation() {
        return secondHouseOrientation;
    }

    public void setSecondHouseOrientation(String secondHouseOrientation) {
        this.secondHouseOrientation = secondHouseOrientation == null ? null : secondHouseOrientation.trim();
    }

    public String getSecondHouseRegion() {
        return secondHouseRegion;
    }

    public void setSecondHouseRegion(String secondHouseRegion) {
        this.secondHouseRegion = secondHouseRegion == null ? null : secondHouseRegion.trim();
    }

    public String getAdvantageid() {
        return advantageid;
    }

    public void setAdvantageid(String advantageid) {
        this.advantageid = advantageid == null ? null : advantageid.trim();
    }

    public Double getSecondHouseTotalPrice() {
        return secondHouseTotalPrice;
    }

    public void setSecondHouseTotalPrice(Double secondHouseTotalPrice) {
        this.secondHouseTotalPrice = secondHouseTotalPrice;
    }

    public String getSecondHouseGrade() {
        return secondHouseGrade;
    }

    public void setSecondHouseGrade(String secondHouseGrade) {
        this.secondHouseGrade = secondHouseGrade == null ? null : secondHouseGrade.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getTotalfloor() {
        return totalfloor;
    }

    public void setTotalfloor(String totalfloor) {
        this.totalfloor = totalfloor == null ? null : totalfloor.trim();
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift == null ? null : lift.trim();
    }
}