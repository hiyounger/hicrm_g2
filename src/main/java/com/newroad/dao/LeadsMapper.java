package com.newroad.dao;

import com.newroad.entity.Leads;

public interface LeadsMapper {
    int insert(Leads record);

    int insertSelective(Leads record);

    Leads selectByPrimaryKey(Integer id);
}