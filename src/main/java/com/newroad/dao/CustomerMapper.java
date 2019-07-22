package com.newroad.dao;

import com.newroad.entity.Customer;

public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);
}