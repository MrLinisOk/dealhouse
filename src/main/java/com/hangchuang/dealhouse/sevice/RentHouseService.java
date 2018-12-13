package com.hangchuang.dealhouse.sevice;


import com.hangchuang.dealhouse.pojo.RentingHouse;
import com.hangchuang.dealhouse.vo.SearchConditionVo;

import java.util.List;

public interface RentHouseService {
    public List<RentingHouse> dynamicQuery(int bigTime, //时间从大到小
                                           int smallTime, //时间从小到大
                                           int bigArea, //面积从大到小
                                           int smallArea, //面积从小到大
                                           int bigPrice, //价格从高到底
                                           int smallPrice, //价格从低到高
                                           int houseingTypeId,//房屋类型（住宅，公寓， 别墅， 商铺）
                                           int featureId,//房屋优势
                                           int countryId,//房屋区域（金水， 惠济， 东区）`
                                           double priceRangeSmall,//价格区间（小）
                                           double priceRangeBig,//价格区间（大）
                                           int areaRangeSmall, //面积区间（小）
                                           int areaRangeBig, //面积区间（大）
                                           String orientation,//朝向（东西南北，南北）
                                           String floor,//楼层（低楼层，中楼层， 高楼层）
                                           String lift,//电梯（有，无）
                                           int index,//起始页数
                                           int count//一页多少个
    );

    public List<SearchConditionVo> searchCondition(String country);
}
