package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.MarketingcontrolInformation;

public interface MarketingcontrolInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MarketingcontrolInformation record);

    int insertSelective(MarketingcontrolInformation record);

    MarketingcontrolInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MarketingcontrolInformation record);

    int updateByPrimaryKey(MarketingcontrolInformation record);
}