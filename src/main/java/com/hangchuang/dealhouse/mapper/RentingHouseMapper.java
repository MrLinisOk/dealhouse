package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.RentingHouse;
import com.hangchuang.dealhouse.utils.RentHouseSmallResult;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface RentingHouseMapper {

    //动态查询租房
    List<RentHouseSmallResult> dynamicQuery(Map<String, Object> map);

}