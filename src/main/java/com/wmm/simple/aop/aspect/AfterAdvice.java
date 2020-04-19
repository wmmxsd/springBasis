package com.wmm.simple.aop.aspect;

import com.wmm.simple.aop.invocation.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:33
 */
public class AfterAdvice implements Aspect{
    private Object bean;
    private MethodInvocation methodInvocation;

    public AfterAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         method.invoke(bean, args);
         methodInvocation.invoke();
        return proxy;
    }
}
