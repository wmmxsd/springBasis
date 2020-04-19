package com.wmm.simple.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 15:29
 */
public class CGlibAgent implements MethodInterceptor {
    private Object bean;

    public Object getInstance(Object object) {
        bean = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.bean.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>>before invoking");
        //真正调用
        Object ret = methodProxy.invokeSuper(o, objects);
        System.out.println(">>>>after invoking");
        return ret;
    }
}
