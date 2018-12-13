package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.RentingHouse;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface RentingHouseMapper {

    List<RentingHouse> dynamicQuery(Map<String, Object> map);

}