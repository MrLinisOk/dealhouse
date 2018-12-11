package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.Area;

import javax.validation.constraints.Size;

public interface AreaMapper {

    Area selectAreaByShorName(String shortname);
}