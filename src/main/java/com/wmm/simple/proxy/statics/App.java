package com.wmm.simple.proxy.statics;

import com.wmm.simple.proxy.service.UserService;
import com.wmm.simple.proxy.service.impl.UserServiceImpl;
import com.wmm.simple.proxy.statics.proxy.UserServiceProxy;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 14:42
 */
public class App {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new UserServiceImpl(), "晚饭前", "去参加2019年年会");
        userService.dress();
    }
}
