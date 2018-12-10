package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.RentingHouse;

public interface RentingHouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RentingHouse record);

    int insertSelective(RentingHouse record);

    RentingHouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RentingHouse record);

    int updateByPrimaryKey(RentingHouse record);
}