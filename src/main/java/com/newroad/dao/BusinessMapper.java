package com.newroad.dao;

import com.newroad.entity.Business;

public interface BusinessMapper {
    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(Integer id);
}