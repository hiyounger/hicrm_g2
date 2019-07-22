package com.newroad.dao;

import com.newroad.entity.Position;

public interface PositionMapper {
    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);
}