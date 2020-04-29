package com.wmm.simple.aop.aspect;

import com.wmm.simple.aop.invocation.BeforeAndAfterMethodInvocation;
import com.wmm.simple.aop.invocation.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author wangmingming160328
 * @Description 同时执行前后切点
 * @date @2020/4/29 16:54
 */
public class BeforeAndAfterAdvice implements Aspect{
    private Object bean;
    private BeforeAndAfterMethodInvocation methodInvocation;

    public BeforeAndAfterAdvice(Object bean, BeforeAndAfterMethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvocation.before();
        method.invoke(bean, args);
        methodInvocation.after();
        return proxy;
    }
}
