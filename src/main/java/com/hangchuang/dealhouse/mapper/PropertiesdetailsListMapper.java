package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.PropertiesdetailsList;

public interface PropertiesdetailsListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PropertiesdetailsList record);

    int insertSelective(PropertiesdetailsList record);

    PropertiesdetailsList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PropertiesdetailsList record);

    int updateByPrimaryKey(PropertiesdetailsList record);
}