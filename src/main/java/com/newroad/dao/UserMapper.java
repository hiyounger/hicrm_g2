package com.newroad.dao;

import com.newroad.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    List<User> getUserList();
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
}