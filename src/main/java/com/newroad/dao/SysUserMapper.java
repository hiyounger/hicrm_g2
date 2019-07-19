package com.newroad.dao;

import com.newroad.entity.SysUser;

public interface SysUserMapper {
    int insert(SysUser record);

    int insertSelective(SysUser record);
}