package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.Country;

import java.util.List;

public interface CountryMapper {

    List<Country> selectCountryByPid(int pid);
}