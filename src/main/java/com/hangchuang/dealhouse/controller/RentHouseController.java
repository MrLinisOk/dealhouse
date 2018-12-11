package com.hangchuang.dealhouse.controller;

import com.hangchuang.dealhouse.pojo.RentingHouse;
import com.hangchuang.dealhouse.sevice.RentHouseService;
import com.hangchuang.dealhouse.utils.Result;
import com.hangchuang.dealhouse.vo.SearchConditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
public class RentHouseController {

    @Autowired
    private RentHouseService rentHouseService;

    //若是等于1则是有该搜索条件，若是等于null则无该搜索条件
    public Result dynamicQuery(
            int bigTime, //时间从大到小
            int smallTime, //时间从小到大
            int bigArea, //面积从大到小
            int smallArea, //面积从小到大
            int bigPrice, //价格从高到底
            int smallPrice, //价格从低到高
            int houseingTypeId,//房屋类型（住宅，公寓， 别墅， 商铺） 这个传id
            int featureId,//房屋优势 这个传id
            int countryId,//房屋区域（金水， 惠济， 东区） 这个传id
            double priceRangeSmall,//价格区间（小）  传起始价格
            double priceRangeBig,//价格区间（大）传最大价格
            int areaRangeSmall, //面积区间（小）传起始面积
            int areaRangeBig, //面积区间（大）传最大面积
            String orientation,//朝向（东西南北，南北） 传d x n b 0
            String floor,//楼层（低楼层，中楼层， 高楼层）传d z g
            String lift,//电梯（有，无）传 0 1  0没有  1有
            int index,//起始页数
            int count//一页多少个
            ){
        Result R = new Result();
        try {
            List<RentingHouse> list = rentHouseService.dynamicQuery(bigTime, smallTime, bigArea, smallArea, bigPrice, smallPrice, houseingTypeId, featureId, countryId, priceRangeSmall, priceRangeBig, areaRangeSmall, areaRangeBig, orientation, floor, lift, index, count);
            R.setStatus(1);
            R.setData(list);
        } catch (Exception e) {
            R.setData("error");
            R.setStatus(0);
        }

        return R;
    }

    @RequestMapping(value = "/testSearch")
    public Result search(int countryId, //区域id
                         double priceRangeBig, //价格区间搜索大
                         double priceRangeSmall, //价格区间搜索小
                         List<String> housetype//房型数组 0不限 1一室 2二室 3三室 4四室 5五室 6五室以上
                         //List<>
                         ){
        Result R = new Result();


        return R;
    }

    @RequestMapping(value = "/searchCondition")
    public Result searchCondition(String country){
        Result R = new Result();
        try {
            List<SearchConditionVo> list = rentHouseService.searchCondition(country);
            R.setData(list);
            R.setStatus(1);
        } catch (Exception e) {
            R.setData("error");
            R.setStatus(0);
        }
        return R;
    }
}
