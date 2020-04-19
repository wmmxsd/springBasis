package com.wmm.simple.proxy.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 14:57
 */
public class DynamicProxyFactory {
    public static Object getProxy(Object object, InvocationHandler invocationHandler){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), invocationHandler);
    }
}
