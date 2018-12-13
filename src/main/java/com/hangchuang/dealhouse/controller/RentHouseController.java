package com.hangchuang.dealhouse.controller;

import com.hangchuang.dealhouse.mapper.HouseTypeMapper;
import com.hangchuang.dealhouse.mapper.HousingTypeMapper;
import com.hangchuang.dealhouse.pojo.HousingType;
import com.hangchuang.dealhouse.pojo.RentingHouse;
import com.hangchuang.dealhouse.sevice.RentHouseService;
import com.hangchuang.dealhouse.utils.RentHouseParameter;
import com.hangchuang.dealhouse.utils.RentHouseSmallResult;
import com.hangchuang.dealhouse.utils.Result;
import com.hangchuang.dealhouse.vo.SearchConditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
public class RentHouseController {

    @Autowired
    private RentHouseService rentHouseService;

    @Autowired
    private HousingTypeMapper housingTypeMapper;

    @RequestMapping(value = "/testSearch")
    public Result search(int countryId, //区域id  id int 数字    必写！！！！！！
                         String sort, //花式排序  汉字
                         String[] housetype,//房型类型数组 0不限 1一室 2二室 3三室 4四室 5五室 6五室以上
                         String[] arealist,//面积  30-40  例
                         String[] orientation,//朝向  汉字
                         String[] decoration,//装修  汉字
                         String[] lift,//电梯  汉字
                         String[] housingTypeName,//用途  String 汉字  住宅，公寓····
                         String[] structure, //结构buildingstructure 汉字
                         String[] floor, //楼层  service转成具体数值范围  汉字
                         String[] rentsys,//方式   合租/整租 汉字
                         String[] advantage, //房屋优势 汉字
                         String[] priceRange, //价格区间
                         int index,//起始页
                         int count //一页多少个
                          ){
        Result R = new Result();
        System.out.println(advantage.length);

        int[] housingtypeid = new int[housingTypeName.length];
        //根居housingtype的名字找到其id放进housingtypeid数组
        for (int i = 0; i < housingTypeName.length; i++) {
            housingtypeid[i] = housingTypeMapper.selectHousingTypeByName(housingTypeName[i]).getId();
        }

        try {
            //renthouse.getCountryId(), renthouse.getPriceSort(), renthouse.getAcreageSort(), renthouse.getHousetype(), renthouse.getArealist(), renthouse.getOrientation(), renthouse.getDecoration(), renthouse.getLift(), renthouse.getUse(), renthouse.getStructure(), renthouse.getFloor(), renthouse.getRentsys(), renthouse.getAdvantage(), renthouse.getPriceRange()
            List<RentHouseSmallResult> list = rentHouseService.dynamicQuery1(countryId, sort, housetype, arealist, orientation, decoration, lift, housingtypeid, structure, floor, rentsys, advantage, priceRange, index, count);
            R.setStatus(1);
            R.setData(list);
        } catch (Exception e) {
            R.setStatus(0);
            R.setData(e);
        }

        return R;
    }

    @RequestMapping(value = "/searchCondition")
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
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
