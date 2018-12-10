package com.hangchuang.dealhouse.serviceImpl;

import com.hangchuang.dealhouse.mapper.UserMapper;
import com.hangchuang.dealhouse.pojo.User;
import com.hangchuang.dealhouse.sevice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestImpl implements TestService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
