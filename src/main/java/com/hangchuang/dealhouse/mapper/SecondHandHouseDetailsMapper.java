package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SecondHandHouseDetails;

public interface SecondHandHouseDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondHandHouseDetails record);

    int insertSelective(SecondHandHouseDetails record);

    SecondHandHouseDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondHandHouseDetails record);

    int updateByPrimaryKey(SecondHandHouseDetails record);
}