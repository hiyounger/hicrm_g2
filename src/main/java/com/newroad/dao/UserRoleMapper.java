package com.newroad.dao;

import com.newroad.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}