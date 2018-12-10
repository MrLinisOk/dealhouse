package com.hangchuang.dealhouse.pojo;

public class CompleteIndoor {
    private Integer id;

    private String completeName;

    private String completePicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName == null ? null : completeName.trim();
    }

    public String getCompletePicture() {
        return completePicture;
    }

    public void setCompletePicture(String completePicture) {
        this.completePicture = completePicture == null ? null : completePicture.trim();
    }
}