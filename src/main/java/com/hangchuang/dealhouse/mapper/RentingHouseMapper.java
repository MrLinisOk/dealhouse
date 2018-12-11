package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.RentingHouse;

import java.util.List;
import java.util.Map;

public interface RentingHouseMapper {

    List<RentingHouse> dynamicQuery(Map<String, Object> map);
}