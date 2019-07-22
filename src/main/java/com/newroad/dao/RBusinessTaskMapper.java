package com.newroad.dao;

import com.newroad.entity.RBusinessTask;

public interface RBusinessTaskMapper {
    int insert(RBusinessTask record);

    int insertSelective(RBusinessTask record);

    RBusinessTask selectByPrimaryKey(Integer id);
}