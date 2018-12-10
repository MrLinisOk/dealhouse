package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.SecondHousingIntroduction;

public interface SecondHousingIntroductionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondHousingIntroduction record);

    int insertSelective(SecondHousingIntroduction record);

    SecondHousingIntroduction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondHousingIntroduction record);

    int updateByPrimaryKey(SecondHousingIntroduction record);
}