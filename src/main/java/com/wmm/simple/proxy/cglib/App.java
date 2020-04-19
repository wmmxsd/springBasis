package com.wmm.simple.proxy.cglib;

import com.wmm.simple.proxy.cglib.bean.User;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 15:34
 */
public class App {
    public static void main(String[] args) {
        CGlibAgent agent = new CGlibAgent();
        User user = (User) agent.getInstance(new User());
        user.eat();
    }
}
