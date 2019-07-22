package com.newroad.dao;

import com.newroad.entity.Message;

public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);
}