package com.hangchuang.dealhouse.serviceImpl;

import com.hangchuang.dealhouse.mapper.AreaMapper;
import com.hangchuang.dealhouse.mapper.CountryMapper;
import com.hangchuang.dealhouse.mapper.RentingHouseMapper;
import com.hangchuang.dealhouse.pojo.Area;
import com.hangchuang.dealhouse.pojo.Country;
import com.hangchuang.dealhouse.pojo.RentingHouse;
import com.hangchuang.dealhouse.sevice.RentHouseService;
import com.hangchuang.dealhouse.vo.SearchConditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RentHouseServiceImpl implements RentHouseService{

    @Autowired
    private RentingHouseMapper rentingHouseMapper;

    @Autowired
    private AreaMapper areaMapper;

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<RentingHouse> dynamicQuery(int bigTime, int smallTime, int bigArea, int smallArea, int bigPrice, int smallPrice, int houseingTypeId, int featureId, int countryId, double priceRangeSmall, double priceRangeBig, int areaRangeSmall, int areaRangeBig, String orientation, String floor, String lift, int index, int count) {
        List<RentingHouse> list = new ArrayList<>();
        Map<String, Object> map =  new HashMap<>();
        //bigTime, smallTime, bigArea, smallArea, bigPrice, smallPrice, houseingTypeId, featureId, countryId, priceRangeSmall, priceRangeBig, areaRangeSmall, areaRangeBig, orientation, floor, lift, index, count

        map.put("bigTime", bigTime);
        map.put("smallTime",smallTime);
        map.put("bigArea", bigArea);
        map.put("smallArea", smallArea);
        map.put("bigPrice", bigPrice);
        map.put("smallPrice", smallPrice);
        map.put("houseingTypeId", houseingTypeId);
        map.put("featureId", featureId);
        map.put("countryId", countryId);
        map.put("priceRangeSmall",priceRangeSmall);
        map.put("priceRangeBig",priceRangeBig);
        map.put("areaRangeSmall",areaRangeSmall);
        map.put("areaRangeBig",areaRangeBig);
        map.put("orientation",orientation);
        //map.put("")
        return list;
    }

    @Override
    public List<SearchConditionVo> searchCondition(String country) {
        //这个list用来返回结果
        List<SearchConditionVo> list = new ArrayList<>();

        Area area = areaMapper.selectAreaByShorName(country);
        Integer id = area.getId();
        List<Country> countries = countryMapper.selectCountryByPid(id);
        //所有区域放进vo中
        SearchConditionVo s1 = new SearchConditionVo();
        s1.setTitle("区域");
        s1.setContent(countries);

        list.add(s1);

        //价格区间
        SearchConditionVo s2 = new SearchConditionVo();
        s2.setTitle("价格");
        List<String> l1 = new ArrayList<>();
        l1.add("不限");
        l1.add("500元以下");
        l1.add("500-800元");
        l1.add("800-1200元");
        l1.add("1200-1500元");
        l1.add("1500-2000元");
        l1.add("2000-3000元");
        l1.add("3000-5000元");
        l1.add("5000元以上");
        s2.setContent(l1);

        list.add(s2);

        SearchConditionVo s3 = new SearchConditionVo();
        s3.setTitle("户型");
        List<String> l3 = new ArrayList<>();
        l3.add("不限");
        l3.add("一室");
        l3.add("二室");
        l3.add("三室");
        l3.add("四室");
        l3.add("五室");
        l3.add("五室以上");

        s3.setContent(l3);

        list.add(s3);

        SearchConditionVo s4 = new SearchConditionVo();
        s4.setTitle("更多");

        //这个list1给s4的content
        List<SearchConditionVo> list1 = new ArrayList<>();
        //下面是list1的内容
        SearchConditionVo s5 = new SearchConditionVo();
        s5.setTitle("面积");
        List<String> listS5 = new ArrayList<>();
        listS5.add("30以下");
        listS5.add("30-50");
        listS5.add("50-80");
        listS5.add("80-100");
        listS5.add("100-120");
        listS5.add("120-150");
        listS5.add("150-200");
        listS5.add("200以上");
        s5.setContent(listS5);
        list1.add(s5);

        SearchConditionVo s6 = new SearchConditionVo();
        s6.setTitle("朝向");
        List<String> listS6 = new ArrayList<>();
        listS6.add("南北");
        listS6.add("东");
        listS6.add("西");
        listS6.add("南");
        listS6.add("北");
        s6.setContent(listS6);
        list1.add(s6);

        SearchConditionVo s7 = new SearchConditionVo();
        s7.setTitle("装修");
        List<String> listS7 = new ArrayList<>();
        listS7.add("毛坯");
        listS7.add("普装");
        listS7.add("精装");
        listS7.add("豪装");
        s7.setContent(listS7);
        list1.add(s7);

        SearchConditionVo s8 = new SearchConditionVo();
        s8.setTitle("电梯");
        List<String> listS8 = new ArrayList<>();
        listS8.add("有");
        listS8.add("无");
        s8.setContent(listS8);
        list1.add(s8);

        SearchConditionVo s9 = new SearchConditionVo();
        s9.setTitle("楼龄");
        List<String> listS9 = new ArrayList<>();
        listS9.add("2年以下");
        listS9.add("2-5年");
        listS9.add("5-10年");
        listS9.add("10-15年");
        listS9.add("15-20年");
        listS9.add("20年以上");
        s9.setContent(listS9);
        list1.add(s9);

        SearchConditionVo s10 = new SearchConditionVo();
        s10.setTitle("用途");
        List<String> listS10 = new ArrayList<>();
        listS10.add("住宅");
        listS10.add("公寓");
        listS10.add("别墅");
        listS10.add("商铺");
        listS10.add("车库");
        listS10.add("写字楼");
        listS10.add("其他");
        s10.setContent(listS10);
        list1.add(s10);

        SearchConditionVo s11 = new SearchConditionVo();
        s11.setTitle("结构");
        List<String> listS11 = new ArrayList<>();
        listS11.add("开间");
        listS11.add("平层");
        listS11.add("错层");
        listS11.add("跃层");
        listS11.add("复式");
        s11.setContent(listS11);
        list1.add(s11);

        SearchConditionVo s12 = new SearchConditionVo();
        s12.setTitle("楼层");
        List<String> listS12 = new ArrayList<>();
        listS12.add("低楼层");
        listS12.add("中楼层");
        listS12.add("高楼层");
        s12.setContent(listS12);
        list1.add(s12);

        SearchConditionVo s13 = new SearchConditionVo();
        s13.setTitle("方式");
        List<String> listS13 = new ArrayList<>();
        listS13.add("整租");
        listS13.add("合租");
        s13.setContent(listS13);
        list1.add(s13);

        SearchConditionVo s14 = new SearchConditionVo();
        s14.setTitle("标签");
        List<String> listS14 = new ArrayList<>();
        listS14.add("领包入住");
        listS14.add("带家私");
        listS14.add("带家电");
        listS14.add("可上网");
        listS14.add("近地铁");
        s14.setContent(listS14);
        list1.add(s14);

        s4.setContent(list1);
        list.add(s4);
        return list;
    }
}
