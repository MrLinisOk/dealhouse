package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.PersonalInformation;

public interface PersonalInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonalInformation record);

    int insertSelective(PersonalInformation record);

    PersonalInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PersonalInformation record);

    int updateByPrimaryKeyWithBLOBs(PersonalInformation record);

    int updateByPrimaryKey(PersonalInformation record);
}