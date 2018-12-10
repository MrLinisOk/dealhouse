package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.HousingAdvantages;

public interface HousingAdvantagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HousingAdvantages record);

    int insertSelective(HousingAdvantages record);

    HousingAdvantages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HousingAdvantages record);

    int updateByPrimaryKey(HousingAdvantages record);
}