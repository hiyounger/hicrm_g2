package com.newroad.dao;

import com.newroad.entity.RBusinessContract;

public interface RBusinessContractMapper {
    int insert(RBusinessContract record);

    int insertSelective(RBusinessContract record);

    RBusinessContract selectByPrimaryKey(Integer id);
}