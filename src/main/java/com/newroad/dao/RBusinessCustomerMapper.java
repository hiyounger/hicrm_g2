package com.newroad.dao;

import com.newroad.entity.RBusinessCustomer;

public interface RBusinessCustomerMapper {
    int insert(RBusinessCustomer record);

    int insertSelective(RBusinessCustomer record);

    RBusinessCustomer selectByPrimaryKey(Integer id);
}