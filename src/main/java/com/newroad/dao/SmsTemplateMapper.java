package com.newroad.dao;

import com.newroad.entity.SmsTemplate;

public interface SmsTemplateMapper {
    int insert(SmsTemplate record);

    int insertSelective(SmsTemplate record);

    SmsTemplate selectByPrimaryKey(Integer id);
}