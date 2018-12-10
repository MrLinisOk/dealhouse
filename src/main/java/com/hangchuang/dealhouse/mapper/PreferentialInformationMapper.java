package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.PreferentialInformation;

public interface PreferentialInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PreferentialInformation record);

    int insertSelective(PreferentialInformation record);

    PreferentialInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PreferentialInformation record);

    int updateByPrimaryKey(PreferentialInformation record);
}