package com.hangchuang.dealhouse.pojo;

public class HousingAdvantages {
    private Integer id;

    private String housingAdvantagesName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHousingAdvantagesName() {
        return housingAdvantagesName;
    }

    public void setHousingAdvantagesName(String housingAdvantagesName) {
        this.housingAdvantagesName = housingAdvantagesName == null ? null : housingAdvantagesName.trim();
    }
}