package com.newroad.dao;

import com.newroad.entity.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);
}