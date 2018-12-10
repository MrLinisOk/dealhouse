package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.RealestateInformation;

public interface RealestateInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RealestateInformation record);

    int insertSelective(RealestateInformation record);

    RealestateInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RealestateInformation record);

    int updateByPrimaryKey(RealestateInformation record);
}