package com.hangchuang.dealhouse.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("h");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        System.out.println(list.size());

        //集合转数组
        String[] s = new String[list.size()];

        for (int i = 0; i < s.length; i++) {
            s[i] = list.get(i);
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
