package com.hangchuang.dealhouse.sevice;


import com.hangchuang.dealhouse.pojo.RentingHouse;
import com.hangchuang.dealhouse.utils.RentHouseSmallResult;
import com.hangchuang.dealhouse.vo.SearchConditionVo;

import java.util.List;

public interface RentHouseService {

    public List<SearchConditionVo> searchCondition(String country);

    public List<RentHouseSmallResult> dynamicQuery1(int countryId, //区域id
                                                    String sort, //花式排序
                                                    String[] housetype,//房型类型数组 0不限 1一室 2二室 3三室 4四室 5五室 6五室以上
                                                    String[] arealist,//面积
                                                    String[] orientation,//朝向
                                                    String[] decoration,//装修
                                                    String[] lift,//电梯
                                                    int[] housingtypeid,//用途
                                                    String[] structure, //结构buildingstructure
                                                    String[] floor, //楼层  service转成具体数值范围
                                                    String[] rentsys,//方式   合租/整租
                                                    String[] advantage, //房屋优势
                                                    String[] priceRange, //价格区间
                                                    int index,//起始页数
                                                    int count//一页多少个
    );

}
