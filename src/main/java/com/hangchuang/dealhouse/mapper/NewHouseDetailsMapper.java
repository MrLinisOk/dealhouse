package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.NewHouseDetails;

public interface NewHouseDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewHouseDetails record);

    int insertSelective(NewHouseDetails record);

    NewHouseDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewHouseDetails record);

    int updateByPrimaryKey(NewHouseDetails record);
}