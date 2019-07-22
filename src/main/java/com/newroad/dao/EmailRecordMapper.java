package com.newroad.dao;

import com.newroad.entity.EmailRecord;

public interface EmailRecordMapper {
    int insert(EmailRecord record);

    int insertSelective(EmailRecord record);

    EmailRecord selectByPrimaryKey(Integer id);
}