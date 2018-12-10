package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SecondHandHousedetails;

public interface SecondHandHousedetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondHandHousedetails record);

    int insertSelective(SecondHandHousedetails record);

    SecondHandHousedetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondHandHousedetails record);

    int updateByPrimaryKey(SecondHandHousedetails record);
}