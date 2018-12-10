package com.hangchuang.dealhouse.pojo;

import java.util.Date;

public class PersonalInformation {
    private Integer id;

    private String personalInformationfullName;

    private String personalInformationPosition;

    private String personalInformationJobNumber;

    private String personalInformationDepartment;

    private String personalInformationRegion;

    private String personalInformationGroup;

    private String personalInformationTelephone;

    private String personalInformationWechat;

    private String personalInformationMailbox;

    private String personalInformationHeadimage;

    private Date personalInformationEntryTime;

    private String idcardno;

    private String homeAddress;

    private Integer propertiesinformationHouseids;

    private String honored;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonalInformationfullName() {
        return personalInformationfullName;
    }

    public void setPersonalInformationfullName(String personalInformationfullName) {
        this.personalInformationfullName = personalInformationfullName == null ? null : personalInformationfullName.trim();
    }

    public String getPersonalInformationPosition() {
        return personalInformationPosition;
    }

    public void setPersonalInformationPosition(String personalInformationPosition) {
        this.personalInformationPosition = personalInformationPosition == null ? null : personalInformationPosition.trim();
    }

    public String getPersonalInformationJobNumber() {
        return personalInformationJobNumber;
    }

    public void setPersonalInformationJobNumber(String personalInformationJobNumber) {
        this.personalInformationJobNumber = personalInformationJobNumber == null ? null : personalInformationJobNumber.trim();
    }

    public String getPersonalInformationDepartment() {
        return personalInformationDepartment;
    }

    public void setPersonalInformationDepartment(String personalInformationDepartment) {
        this.personalInformationDepartment = personalInformationDepartment == null ? null : personalInformationDepartment.trim();
    }

    public String getPersonalInformationRegion() {
        return personalInformationRegion;
    }

    public void setPersonalInformationRegion(String personalInformationRegion) {
        this.personalInformationRegion = personalInformationRegion == null ? null : personalInformationRegion.trim();
    }

    public String getPersonalInformationGroup() {
        return personalInformationGroup;
    }

    public void setPersonalInformationGroup(String personalInformationGroup) {
        this.personalInformationGroup = personalInformationGroup == null ? null : personalInformationGroup.trim();
    }

    public String getPersonalInformationTelephone() {
        return personalInformationTelephone;
    }

    public void setPersonalInformationTelephone(String personalInformationTelephone) {
        this.personalInformationTelephone = personalInformationTelephone == null ? null : personalInformationTelephone.trim();
    }

    public String getPersonalInformationWechat() {
        return personalInformationWechat;
    }

    public void setPersonalInformationWechat(String personalInformationWechat) {
        this.personalInformationWechat = personalInformationWechat == null ? null : personalInformationWechat.trim();
    }

    public String getPersonalInformationMailbox() {
        return personalInformationMailbox;
    }

    public void setPersonalInformationMailbox(String personalInformationMailbox) {
        this.personalInformationMailbox = personalInformationMailbox == null ? null : personalInformationMailbox.trim();
    }

    public String getPersonalInformationHeadimage() {
        return personalInformationHeadimage;
    }

    public void setPersonalInformationHeadimage(String personalInformationHeadimage) {
        this.personalInformationHeadimage = personalInformationHeadimage == null ? null : personalInformationHeadimage.trim();
    }

    public Date getPersonalInformationEntryTime() {
        return personalInformationEntryTime;
    }

    public void setPersonalInformationEntryTime(Date personalInformationEntryTime) {
        this.personalInformationEntryTime = personalInformationEntryTime;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public Integer getPropertiesinformationHouseids() {
        return propertiesinformationHouseids;
    }

    public void setPropertiesinformationHouseids(Integer propertiesinformationHouseids) {
        this.propertiesinformationHouseids = propertiesinformationHouseids;
    }

    public String getHonored() {
        return honored;
    }

    public void setHonored(String honored) {
        this.honored = honored == null ? null : honored.trim();
    }
}