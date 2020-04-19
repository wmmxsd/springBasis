package com.wmm.simple.aop.aspect;

import com.wmm.simple.aop.invocation.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:04
 */
public class BeforeAdvice implements Aspect{
    private Object bean;
    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}
