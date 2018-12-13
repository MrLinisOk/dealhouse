package com.hangchuang.dealhouse.utils;

public class RentHouseParameter {

    private int countryId; //区域id
    private String priceSort;//价格排序
    private String acreageSort;//面积排序
    private String[] housetype;//户型数组 0不限 1一室 2二室 3三室 4四室 5五室 6五室以上
    private String[] arealist;//面积
    private String[] orientation;//朝向
    private String[] decoration;//装修
    private String[] lift;//电梯
    private String[] use;//用途  住宅，商铺
    private String[] structure; //结构buildingstructure
    private String[] floor; //楼层  service转成具体数值范围
    private String[] rentsys;//方式   合租/整租
    private String[] advantage; //房屋优势
    private String[] priceRange ;//价格区 间

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getPriceSort() {
        return priceSort;
    }

    public void setPriceSort(String priceSort) {
        this.priceSort = priceSort;
    }

    public String getAcreageSort() {
        return acreageSort;
    }

    public void setAcreageSort(String acreageSort) {
        this.acreageSort = acreageSort;
    }

    public String[] getHousetype() {
        return housetype;
    }

    public void setHousetype(String[] housetype) {
        this.housetype = housetype;
    }

    public String[] getArealist() {
        return arealist;
    }

    public void setArealist(String[] arealist) {
        this.arealist = arealist;
    }

    public String[] getOrientation() {
        return orientation;
    }

    public void setOrientation(String[] orientation) {
        this.orientation = orientation;
    }

    public String[] getDecoration() {
        return decoration;
    }

    public void setDecoration(String[] decoration) {
        this.decoration = decoration;
    }

    public String[] getLift() {
        return lift;
    }

    public void setLift(String[] lift) {
        this.lift = lift;
    }

    public String[] getUse() {
        return use;
    }

    public void setUse(String[] use) {
        this.use = use;
    }

    public String[] getStructure() {
        return structure;
    }

    public void setStructure(String[] structure) {
        this.structure = structure;
    }

    public String[] getFloor() {
        return floor;
    }

    public void setFloor(String[] floor) {
        this.floor = floor;
    }

    public String[] getRentsys() {
        return rentsys;
    }

    public void setRentsys(String[] rentsys) {
        this.rentsys = rentsys;
    }

    public String[] getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String[] advantage) {
        this.advantage = advantage;
    }

    public String[] getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String[] priceRange) {
        this.priceRange = priceRange;
    }
}
