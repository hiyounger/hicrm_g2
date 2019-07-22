package com.newroad.dao;

import com.newroad.entity.BusinessStatus;

public interface BusinessStatusMapper {
    int insert(BusinessStatus record);

    int insertSelective(BusinessStatus record);

    BusinessStatus selectByPrimaryKey(Integer id);
}