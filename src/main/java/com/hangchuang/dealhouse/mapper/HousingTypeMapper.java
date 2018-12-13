package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.HousingType;
import org.apache.ibatis.annotations.Param;

public interface HousingTypeMapper {

    //根据名字查询
    HousingType selectHousingTypeByName(@Param("housingTypeName") String housingTypeName);
}