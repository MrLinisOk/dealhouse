package com.hangchuang.dealhouse.controller;

import com.hangchuang.dealhouse.pojo.SecondHandHouse;
import com.hangchuang.dealhouse.sevice.SecondHandHouseService;
import com.hangchuang.dealhouse.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
zlp二手房首页增加
 */
@RestController
@RequestMapping("/house")
public class SecondHandHouseController {
    @Autowired
    private SecondHandHouseService secondHandHouseService;
    //增加二手房信息
    @RequestMapping("/insertSecondHandHouse")
    public Result insertSecondHandHouse(SecondHandHouse secondHandHouse){
        Result result = new Result();
        try {
            secondHandHouseService.insertSecondHandHouse(secondHandHouse);
            result.setStatus(1);
            result.setData("success");
        } catch (Exception e) {
           result.setStatus(0);
           result.setData(e);
        }
        return result;
    }

    //查询全部信息
    @RequestMapping("/selectSecondHandHouseAll")
    public Result selectSecondHandHouseAll(){
        Result result = new Result();
        try {
            List<SecondHandHouse> list = secondHandHouseService.selectSecondHandHouseAll();
            result.setStatus(1);
            result.setData(list);
        } catch (Exception e) {
            result.setStatus(0);
            result.setData(e);
        }
        return result;
    }
}
