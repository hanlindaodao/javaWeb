package com.daodao.json;

import com.alibaba.fastjson.JSON;
import com.daodao.pojo.User;

public class FastJsonDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("123");

        String s = JSON.toJSONString(user);
        System.out.println(s);

        User u = JSON.parseObject(s, User.class);

        System.out.println(u);
    }
}
