package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.Picture;

public interface PictureMapper {
    Picture selectPicture_id(Integer id);

    int deletePicture_id(Integer id);

    int insertPicture(Picture picture);

    int updatePicture_id(Picture picture);
}