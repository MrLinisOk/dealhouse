package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.HousingType;

public interface HousingTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HousingType record);

    int insertSelective(HousingType record);

    HousingType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HousingType record);

    int updateByPrimaryKey(HousingType record);
}