package com.wmm.simple.aop;

import com.wmm.simple.aop.aspect.Aspect;

import java.lang.reflect.Proxy;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:09
 */
public class SimpleAop {
    public static Object getProxy(Object object, Aspect aspect) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), aspect);
    }
}
