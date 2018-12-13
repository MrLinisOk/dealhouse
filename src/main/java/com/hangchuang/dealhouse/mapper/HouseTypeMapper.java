package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.HouseType;
import org.apache.ibatis.annotations.Param;

public interface HouseTypeMapper {

    HouseType selectHouseTypeByName(@Param("houseTypeName") String houseTypeName);

    HouseType selectHouseTypeById(@Param("name") int name);
}