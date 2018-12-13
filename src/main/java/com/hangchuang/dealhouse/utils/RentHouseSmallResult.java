package com.hangchuang.dealhouse.utils;

public class RentHouseSmallResult {

    private int id;
    private String smalltitle;
    private int housetypeid;
    private String housetypename;
    private int measure;
    private String orientation;
    private String region;
    private String advantageid;
    private Double price;
    private String grade;
    private String[] advantagename;

    public String getHousetypename() {
        return housetypename;
    }

    public void setHousetypename(String housetypename) {
        this.housetypename = housetypename;
    }

    public String[] getAdvantagename() {
        return advantagename;
    }

    public void setAdvantagename(String[] advantagename) {
        this.advantagename = advantagename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSmalltitle() {
        return smalltitle;
    }

    public void setSmalltitle(String smalltitle) {
        this.smalltitle = smalltitle;
    }

    public int getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(int housetypeid) {
        this.housetypeid = housetypeid;
    }

    public int getMeasure() {
        return measure;
    }

    public void setMeasure(int measure) {
        this.measure = measure;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAdvantageid() {
        return advantageid;
    }

    public void setAdvantageid(String advantageid) {
        this.advantageid = advantageid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
