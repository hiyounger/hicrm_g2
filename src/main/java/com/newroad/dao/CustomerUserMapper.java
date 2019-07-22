package com.newroad.dao;

import com.newroad.entity.CustomerUser;

public interface CustomerUserMapper {
    int insert(CustomerUser record);

    int insertSelective(CustomerUser record);
}