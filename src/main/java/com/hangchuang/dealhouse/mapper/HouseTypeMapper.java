package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.HouseType;

public interface HouseTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    HouseType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);
}