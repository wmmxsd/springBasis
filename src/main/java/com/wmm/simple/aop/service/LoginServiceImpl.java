package com.wmm.simple.aop.service;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:21
 */
public class LoginServiceImpl implements LoginService{
    @Override
    public void login() {
        System.out.println("登录成功");
    }
}
