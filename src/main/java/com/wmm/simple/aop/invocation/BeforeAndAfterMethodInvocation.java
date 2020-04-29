package com.wmm.simple.aop.invocation;

/**
 * 同时具有before和after切入点的切面所使用的方法调用类
 * @author wangmingming160328
 * @Description
 * @date @2020/4/29 11:04
 */
public interface BeforeAndAfterMethodInvocation {
    /**
     * bean执行方法前需要执行的方法
     */
    void before();
    /**
     * bean执行方法后需要执行的方法
     */
    void after();
}
