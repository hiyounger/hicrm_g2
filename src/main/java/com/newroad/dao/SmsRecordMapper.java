package com.newroad.dao;

import com.newroad.entity.SmsRecord;

public interface SmsRecordMapper {
    int insert(SmsRecord record);

    int insertSelective(SmsRecord record);

    SmsRecord selectByPrimaryKey(Integer id);
}