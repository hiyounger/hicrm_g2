package com.newroad.dao;

import com.newroad.entity.Contacts;

public interface ContactsMapper {
    int insert(Contacts record);

    int insertSelective(Contacts record);

    Contacts selectByPrimaryKey(Integer id);
}