package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SignIn;

public interface SignInMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SignIn record);

    int insertSelective(SignIn record);

    SignIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SignIn record);

    int updateByPrimaryKey(SignIn record);
}