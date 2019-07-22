package com.newroad.dao;

import com.newroad.entity.EmailTemplate;

public interface EmailTemplateMapper {
    int insert(EmailTemplate record);

    int insertSelective(EmailTemplate record);

    EmailTemplate selectByPrimaryKey(Integer id);
}