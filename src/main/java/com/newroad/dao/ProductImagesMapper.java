package com.newroad.dao;

import com.newroad.entity.ProductImages;

public interface ProductImagesMapper {
    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    ProductImages selectByPrimaryKey(Integer id);
}