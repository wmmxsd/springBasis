package com.wmm.simple.proxy.statics.proxy;

import com.wmm.simple.proxy.service.UserService;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 14:40
 */
public class UserServiceProxy implements UserService {
    private UserService userService;
    private String before;
    private String after;

    public UserServiceProxy(UserService userService, String before, String after) {
        this.userService = userService;
        this.before = before;
        this.after = after;
    }

    @Override
    public void dress() {
        System.out.println(before);
        userService.dress();
        System.out.println(after);
    }
}
