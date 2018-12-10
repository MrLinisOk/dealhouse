package com.hangchuang.dealhouse.mapper;

import com.hangchuang.dealhouse.pojo.NegativeComment;

public interface NegativeCommentMapper {
    int insert(NegativeComment record);

    int insertSelective(NegativeComment record);
}