package com.hangchuang.dealhouse.sevice;

import com.hangchuang.dealhouse.pojo.Picture;

public interface PictureService {
    public Picture selectPicture_id(Integer id);
    public int deletePicture_id(Integer id);
    public int insertPicture(Picture picture);
    public int updatePicture_id(Picture picture);
}
