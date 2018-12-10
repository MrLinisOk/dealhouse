package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.NewHouseList;

public interface NewHouseListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewHouseList record);

    int insertSelective(NewHouseList record);

    NewHouseList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewHouseList record);

    int updateByPrimaryKey(NewHouseList record);
}