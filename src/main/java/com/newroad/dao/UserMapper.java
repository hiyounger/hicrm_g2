package com.newroad.dao;

import com.newroad.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
}