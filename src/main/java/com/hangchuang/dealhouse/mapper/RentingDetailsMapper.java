package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.RentingDetails;

public interface RentingDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RentingDetails record);

    int insertSelective(RentingDetails record);

    RentingDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RentingDetails record);

    int updateByPrimaryKey(RentingDetails record);
}