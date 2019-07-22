package com.newroad.dao;

import com.newroad.entity.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);
}