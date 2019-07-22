package com.newroad.dao;

import com.newroad.entity.ProductCategory;

public interface ProductCategoryMapper {
    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer id);
}