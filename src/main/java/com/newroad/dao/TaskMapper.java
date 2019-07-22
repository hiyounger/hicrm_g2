package com.newroad.dao;

import com.newroad.entity.Task;

public interface TaskMapper {
    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Integer id);
}