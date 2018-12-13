package com.hangchuang.dealhouse.serviceImpl;

import com.hangchuang.dealhouse.mapper.*;
import com.hangchuang.dealhouse.pojo.*;
import com.hangchuang.dealhouse.sevice.RentHouseService;
import com.hangchuang.dealhouse.vo.SearchConditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sound.midi.Soundbank;
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

    @Autowired
    private HousingAdvantagesMapper housingAdvantagesMapper;

    @Autowired
    private HouseTypeMapper houseTypeMapper;


    @Override
    public List<SearchConditionVo> searchCondition(String country) {
        //这个list用来返回结果
        List<SearchConditionVo> list = new ArrayList<>();

        Area area = areaMapper.selectAreaByShorName(country);
        //如果区域不存在直接返回不存在
        if (area == null){
            SearchConditionVo searchConditionVo = new SearchConditionVo();
            searchConditionVo.setTitle("区域");
            searchConditionVo.setContent("不存在");
            list.add(searchConditionVo);
            return list;
        }
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
        List<HousingAdvantages> housingAdvantages = housingAdvantagesMapper.selectAllAdvantage();
        for (HousingAdvantages h: housingAdvantages) {
            String housingAdvantagesName = h.getHousingAdvantagesName();
            //吧这些优势全部放进去
            listS14.add(housingAdvantagesName);
        }
        s14.setContent(listS14);
        list1.add(s14);

        s4.setContent(list1);

        list.add(s4);

        SearchConditionVo s15 = new SearchConditionVo();
        s15.setTitle("排序");
        List<String> l15 = new ArrayList<>();
        l15.add("综合排序");
        l15.add("租金由低到高");
        l15.add("租金由高到底");
        l15.add("面积由小到大");
        l15.add("面积由大到小");

        s15.setContent(l15);

        list.add(s15);
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<RentingHouse> dynamicQuery1(int countryId, String sort, String[] housetype, String[] arealist, String[] orientation, String[] decoration, String[] lift, int[] housingtypeid, String[] structure, String[] floor, String[] rentsys, String[] advantage, String[] priceRange, int index, int count) {
        //这个map传参给mapper
        Map<String, Object> map = new HashMap<>();

        //房源优势id 需要一个数组里面放id s

        map.put("index", index);
        map.put("count", count);
        String[] advantageIds = new String[advantage.length];

        for (int i = 0; i < advantage.length; i++) {
            String s = advantage[i];
            //拿出来这个优势名s  根据这个优势名查询这个优势在表中的id
            HousingAdvantages h = housingAdvantagesMapper.selectAdvantageByName(s);
            //得到优势id
            Integer id = h.getId();
            //放入数组中
            System.out.println("房屋优势id++++++++++++++++++" + id);
            advantageIds[i] = "%"+id+"%";
        }
        map.put("advantageIds", advantageIds);
        //房源优势放入完成

        //户型开始
        System.out.println("户型housetype+++++++++++++++++++" + housetype.length);

        int[] houseTypes = new int[housetype.length];
        for (int i = 0; i < housetype.length; i++) {
            String  s = housetype[i];
            //根据户型名查询户型id 一室 二室 三室
            HouseType h = houseTypeMapper.selectHouseTypeByName(s);
            Integer id = h.getId();
            houseTypes[i] = id;
        }
        map.put("housetypes", houseTypes);
        //户型结束

        //朝向
        System.out.println("朝向orientation++++++++++++++++++++++" + orientation.length);
        map.put("orientation", orientation);
        //朝向结束

        //装饰
        System.out.println("装饰decoration"+decoration.length);
        map.put("decoration",decoration);
        //装饰结束

        //电梯
        System.out.println("电梯lift++++++++++++++++++++++"+lift.length);
        map.put("lift", lift);
        //电梯结束hu

        //房屋类型
        System.out.println("房屋类型housingtypeid+++++++++++++++++++++++++" + housingtypeid.length);

        map.put("housingtypeid", housingtypeid);
        //房屋类型结束

        //结构
        System.out.println("结构buildingstructure_+++++++++++++++++++++++" + structure.length);
        map.put("buildingstructure", structure);
        //结构结束

        //楼层 floor  String[]
        for (String f: floor) {
            if (f.equals("低楼层")){
                System.out.println("我是低楼层");
                map.put("low", 1);
                continue;
            }
            if (f.equals("中楼层")){
                System.out.println("我是中楼层");
                map.put("middle", 1);
                continue;
            }
            if (f.equals("高楼层")){
                System.out.println("我是高楼层");
                map.put("high", 1);
                continue;
            }
        }
        //楼层结束

        //租房方式
        System.out.println("租房方式++++++++++++++++++++++++++" + rentsys.length);
        map.put("rentsys", rentsys);
        //租房方式结束

        //区域id
        System.out.println("区域id+++++++++++++++++++++++"+countryId);
        map.put("countryId", countryId);
        //区域结束

        //价钱区间
        for (String p: priceRange) {
            //获取每一个价钱 p
            if (p.equals("500元以下")){
                System.out.println("价钱。。。。。500.......................");
                map.put("fiveLowPrice", 1);
                continue;
            }
            if (p.equals("500-800元")){
                System.out.println("5-8..................");
                map.put("fiveEightPrice", 1);
                continue;
            }
            if (p.equals("800-1200元")){
                System.out.println("8-12...................");
                map.put("eightTwelvePrice", 1);
                continue;
            }
            if (p.equals("1200-1500元")){
                System.out.println("12-15.................");
                map.put("twelveFifteenPrice", 1);
                continue;
            }
            if (p.equals("1500-2000元")){
                System.out.println("15-20..................");
                map.put("fifteenTwentyPrice", 1);
                continue;
            }
            if (p.equals("2000-3000元")){
                System.out.println("20-30..................");
                map.put("twentyThirtyPrice", 1);
                continue;
            }
            if (p.equals("3000-5000元")){
                System.out.println("30-50.................");
                map.put("thirtyFiftyPrice", 1);
                continue;
            }
            if (p.equals("5000元以上")){
                System.out.println("50+++++++++++..................");
                map.put("fiftyHighPrice", 1);
                continue;
            }
        }
        //价格区间结束

        //面积区间
        for (String a:arealist) {
            if (a.equals("30以下")){
                System.out.println("面积30-------...............");
                map.put("threeLowAcreage",1);
                continue;
            }
            if (a.equals("30-50")){
                System.out.println("30-50.....................");
                map.put("threeFiveAcreage",1);
                continue;
            }
            if (a.equals("50-80")){
                System.out.println("50-80........................");
                map.put("fiveEightAcreage",1);
                continue;
            }
            if (a.equals("80-100")){
                System.out.println("80-100..................");
                map.put("eightTenAcreage",1);
                continue;
            }
            if (a.equals("100-120")){
                System.out.println("100-120.....................");
                map.put("tenTwelveAcreage",1);
                continue;
            }

            if (a.equals("120-150")){
                System.out.println("12-15");
                map.put("twelveFifteenAcreage",1);
                continue;
            }
            if (a.equals("150-200")){
                System.out.println("15-20");
                map.put("fifteenTwentyAcreage",1);
                continue;
            }
            if (a.equals("200以上")){
                System.out.println("20+++++++");
                map.put("fifteenTwentyAcreage",1);
                continue;
            }

        }
        //面积结束

        //花式排序， 价格正序、倒叙 面积正序，倒叙             String priceSort, //价格排序
        //                                              String acreageSort,//面积排序
        /*l15.add("综合排序");
        l15.add("租金由低到高");
        l15.add("租金由高到底");
        l15.add("面积由小到大");
        l15.add("面积由大到小");*/

        if(sort.equals("租金由低到高")){
            System.out.println("租金由低到高");
            map.put("sname", "second_house_total_price");
            map.put("sort", "ASC");
        }
        if(sort.equals("租金由高到底")){
            System.out.println("租金由高到底");
            map.put("sname", "second_house_total_price");
            map.put("sort", "DESC");
        }
        if(sort.equals("面积由小到大")){
            System.out.println("面积由小到大");
            map.put("sname", "second_house_measure");
            map.put("sort", "ASC");
        }
        if(sort.equals("面积由大到小")){
            System.out.println("面积由大到小");
            map.put("sname", "second_house_measure");
            map.put("sort", "DESC");
        }

        System.out.println("housetypes");
        List<RentingHouse> list = rentingHouseMapper.dynamicQuery(map);
        return list;
    }
}
