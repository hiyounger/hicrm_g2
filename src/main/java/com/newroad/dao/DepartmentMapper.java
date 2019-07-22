package com.newroad.dao;

import com.newroad.entity.Department;

public interface DepartmentMapper {
    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);
}