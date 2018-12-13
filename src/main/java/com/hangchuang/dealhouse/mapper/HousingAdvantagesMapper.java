package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.HousingAdvantages;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

public interface HousingAdvantagesMapper {

    List<HousingAdvantages> selectAllAdvantage();

    HousingAdvantages selectAdvantageByName(@Param("advantageName") String advantageName);
}