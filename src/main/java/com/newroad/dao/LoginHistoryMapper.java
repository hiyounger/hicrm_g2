package com.newroad.dao;

import com.newroad.entity.LoginHistory;

public interface LoginHistoryMapper {
    int insert(LoginHistory record);

    int insertSelective(LoginHistory record);

    LoginHistory selectByPrimaryKey(Integer id);
}