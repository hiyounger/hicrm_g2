package com.newroad.dao;

import com.newroad.entity.Announcement;

public interface AnnouncementMapper {
    int insert(Announcement record);

    int insertSelective(Announcement record);

    Announcement selectByPrimaryKey(Integer id);
}