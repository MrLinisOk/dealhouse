package com.hangchuang.dealhouse.sevice;

import com.hangchuang.dealhouse.pojo.SecondHandHouse;

import java.util.List;

public interface SecondHandHouseService {

    //查询二手房信息所有
    public SecondHandHouse selectAllSecondHandHouse();
    //增加二手房信息
    public  int insertSecondHandHouse(SecondHandHouse secondHandHouse);

   public List<SecondHandHouse> selectSecondHandHouseAll();
}
