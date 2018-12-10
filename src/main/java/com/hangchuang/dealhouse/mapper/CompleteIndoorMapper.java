package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.CompleteIndoor;

public interface CompleteIndoorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompleteIndoor record);

    int insertSelective(CompleteIndoor record);

    CompleteIndoor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompleteIndoor record);

    int updateByPrimaryKey(CompleteIndoor record);
}