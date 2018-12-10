package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SecondHandHouse;

public interface SecondHandHouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondHandHouse record);

    int insertSelective(SecondHandHouse record);

    SecondHandHouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondHandHouse record);

    int updateByPrimaryKey(SecondHandHouse record);
}