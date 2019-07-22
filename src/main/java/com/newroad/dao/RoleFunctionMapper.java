package com.newroad.dao;

import com.newroad.entity.RoleFunction;

public interface RoleFunctionMapper {
    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);
}