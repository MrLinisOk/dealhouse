package com.hangchuang.dealhouse.serviceImpl;

import com.hangchuang.dealhouse.mapper.PictureMapper;
import com.hangchuang.dealhouse.mapper.SecondHandHouseMapper;
import com.hangchuang.dealhouse.pojo.SecondHandHouse;
import com.hangchuang.dealhouse.sevice.PictureService;
import com.hangchuang.dealhouse.sevice.SecondHandHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SecondHandHouseServiceImpl implements SecondHandHouseService{
    @Autowired
    private SecondHandHouseMapper secondHandHouseDao;
    //查询所有
    @Override
    public SecondHandHouse selectAllSecondHandHouse() {
        return null;
    }

    //添加二手房信息
    @Override
    public int insertSecondHandHouse(SecondHandHouse secondHandHouse) {
        int i = secondHandHouseDao.insertSecondHandHouse(secondHandHouse);
        if (i!=0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public List<SecondHandHouse> selectSecondHandHouseAll() {
        return secondHandHouseDao.selectSecondHandHouseAll();
    }
}
