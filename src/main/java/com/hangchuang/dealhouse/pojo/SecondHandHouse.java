package com.hangchuang.dealhouse.pojo;

public class SecondHandHouse {
    private Integer id;

    private String secondHouseTitle;

    private Integer secondHouseHuxing;

    private Integer secondHouseMeasure;

    private String secondHouseOrientation;

    private String secondHouseRegion;

    private String secondHouseSubway;

    private String secondHouseYears;

    private String secondHouseSee;

    private Double secondHouseTotalPrice;

    private Double secondHouseAveragePrice;

    private String secondHouseGrade;

    private String secondHouseLift;

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

    public String getSecondHouseSubway() {
        return secondHouseSubway;
    }

    public void setSecondHouseSubway(String secondHouseSubway) {
        this.secondHouseSubway = secondHouseSubway == null ? null : secondHouseSubway.trim();
    }

    public String getSecondHouseYears() {
        return secondHouseYears;
    }

    public void setSecondHouseYears(String secondHouseYears) {
        this.secondHouseYears = secondHouseYears == null ? null : secondHouseYears.trim();
    }

    public String getSecondHouseSee() {
        return secondHouseSee;
    }

    public void setSecondHouseSee(String secondHouseSee) {
        this.secondHouseSee = secondHouseSee == null ? null : secondHouseSee.trim();
    }

    public Double getSecondHouseTotalPrice() {
        return secondHouseTotalPrice;
    }

    public void setSecondHouseTotalPrice(Double secondHouseTotalPrice) {
        this.secondHouseTotalPrice = secondHouseTotalPrice;
    }

    public Double getSecondHouseAveragePrice() {
        return secondHouseAveragePrice;
    }

    public void setSecondHouseAveragePrice(Double secondHouseAveragePrice) {
        this.secondHouseAveragePrice = secondHouseAveragePrice;
    }

    public String getSecondHouseGrade() {
        return secondHouseGrade;
    }

    public void setSecondHouseGrade(String secondHouseGrade) {
        this.secondHouseGrade = secondHouseGrade == null ? null : secondHouseGrade.trim();
    }

    public String getSecondHouseLift() {
        return secondHouseLift;
    }

    public void setSecondHouseLift(String secondHouseLift) {
        this.secondHouseLift = secondHouseLift == null ? null : secondHouseLift.trim();
    }
}