package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.Praise;

public interface PraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Praise record);

    int insertSelective(Praise record);

    Praise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Praise record);

    int updateByPrimaryKey(Praise record);
}