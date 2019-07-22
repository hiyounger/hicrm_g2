package com.newroad.dao;

import com.newroad.entity.RBusinessProduct;

public interface RBusinessProductMapper {
    int insert(RBusinessProduct record);

    int insertSelective(RBusinessProduct record);

    RBusinessProduct selectByPrimaryKey(Integer id);
}