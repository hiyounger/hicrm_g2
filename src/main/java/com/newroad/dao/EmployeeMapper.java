package com.newroad.dao;

import com.newroad.entity.Employee;

public interface EmployeeMapper {
    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);
}