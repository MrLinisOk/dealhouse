package com.hangchuang.dealhouse.controller;

import com.hangchuang.dealhouse.pojo.User;
import com.hangchuang.dealhouse.sevice.TestService;
import com.hangchuang.dealhouse.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    public Result select(int id){
        Result result = new Result();

        try {
            User user = testService.selectUser(id);
            result.setStatus(1);
            result.setData(user);
        } catch (Exception e) {
            result.setStatus(0);
            result.setData(e);
        }

        return result;

    }
}
