package com.newroad.entity;

import java.util.Date;

public class Leads {
    private Integer id;

    private Integer ownerUserId;

    private Integer creatorUserId;

    private String name;

    private String position;

    private String contactsName;

    private String saltname;

    private String mobile;

    private String email;

    private Date createTime;

    private Date updateTime;

    private Integer deleteStatus;

    private Integer deleteUserId;

    private Date deleteTime;

    private Integer isTransformed;

    private Integer transformUserId;

    private Integer contactsId;

    private Integer customerId;

    private Integer businessId;

    private String nextstep;

    private Date nextstepTime;

    private Date haveTime;

    private String address;

    private String source;

    private String leadnote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getSaltname() {
        return saltname;
    }

    public void setSaltname(String saltname) {
        this.saltname = saltname == null ? null : saltname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(Integer deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getIsTransformed() {
        return isTransformed;
    }

    public void setIsTransformed(Integer isTransformed) {
        this.isTransformed = isTransformed;
    }

    public Integer getTransformUserId() {
        return transformUserId;
    }

    public void setTransformUserId(Integer transformUserId) {
        this.transformUserId = transformUserId;
    }

    public Integer getContactsId() {
        return contactsId;
    }

    public void setContactsId(Integer contactsId) {
        this.contactsId = contactsId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getNextstep() {
        return nextstep;
    }

    public void setNextstep(String nextstep) {
        this.nextstep = nextstep == null ? null : nextstep.trim();
    }

    public Date getNextstepTime() {
        return nextstepTime;
    }

    public void setNextstepTime(Date nextstepTime) {
        this.nextstepTime = nextstepTime;
    }

    public Date getHaveTime() {
        return haveTime;
    }

    public void setHaveTime(Date haveTime) {
        this.haveTime = haveTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getLeadnote() {
        return leadnote;
    }

    public void setLeadnote(String leadnote) {
        this.leadnote = leadnote == null ? null : leadnote.trim();
    }
}