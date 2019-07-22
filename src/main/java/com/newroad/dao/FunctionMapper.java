package com.newroad.dao;

import com.newroad.entity.Function;

public interface FunctionMapper {
    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer id);
}