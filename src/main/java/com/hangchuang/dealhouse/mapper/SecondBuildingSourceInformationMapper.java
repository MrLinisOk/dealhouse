package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SecondBuildingSourceInformation;

public interface SecondBuildingSourceInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondBuildingSourceInformation record);

    int insertSelective(SecondBuildingSourceInformation record);

    SecondBuildingSourceInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondBuildingSourceInformation record);

    int updateByPrimaryKey(SecondBuildingSourceInformation record);
}