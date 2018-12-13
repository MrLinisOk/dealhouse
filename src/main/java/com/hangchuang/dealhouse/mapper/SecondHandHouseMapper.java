package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SecondHandHouse;

import java.util.List;
import java.util.Map;

public interface SecondHandHouseMapper {

    //根据关联ID查询二手房信息
    SecondHandHouse selectSecondHandHouse_ID(Integer secondIndoorId);
    //增加二手房信息
     int insertSecondHandHouse(SecondHandHouse secondHandHouse);
     //查询所有二手房信息
     List<SecondHandHouse>selectSecondHandHouseAll();

}