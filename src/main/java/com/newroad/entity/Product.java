package com.newroad.entity;

import java.util.Date;

public class Product {
    private Integer id;

    private Integer categoryId;

    private String name;

    private Integer creatorUserId;

    private Float costPrice;

    private Float suggestedPrice;

    private String developmentTeam;

    private Date developmentTime;

    private String link;

    private Date createTime;

    private Date updateTime;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Float getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Float costPrice) {
        this.costPrice = costPrice;
    }

    public Float getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(Float suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public String getDevelopmentTeam() {
        return developmentTeam;
    }

    public void setDevelopmentTeam(String developmentTeam) {
        this.developmentTeam = developmentTeam == null ? null : developmentTeam.trim();
    }

    public Date getDevelopmentTime() {
        return developmentTime;
    }

    public void setDevelopmentTime(Date developmentTime) {
        this.developmentTime = developmentTime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}