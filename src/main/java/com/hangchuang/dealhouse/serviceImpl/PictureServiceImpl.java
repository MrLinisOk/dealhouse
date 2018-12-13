package com.hangchuang.dealhouse.serviceImpl;

import com.hangchuang.dealhouse.mapper.PictureMapper;
import com.hangchuang.dealhouse.pojo.Picture;
import com.hangchuang.dealhouse.sevice.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl implements PictureService{
    @Autowired
    private PictureMapper pictureMapper;
    @Override
    public Picture selectPicture_id(Integer id) {
        return pictureMapper.selectPicture_id(id);
    }
    @Override
    public int deletePicture_id(Integer id) {
        int i = pictureMapper.deletePicture_id(id);
        if (i!=0){
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public int insertPicture(Picture picture) {
        int i = pictureMapper.insertPicture(picture);
        if (i!=0){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int updatePicture_id(Picture picture) {
        int i = pictureMapper.updatePicture_id(picture);
        if (i!=0){
            return 1;
        }else {
            return 0;
        }
    }
}
