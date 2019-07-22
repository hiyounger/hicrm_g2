package com.newroad.dao;

import com.newroad.entity.Contract;

public interface ContractMapper {
    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer id);
}