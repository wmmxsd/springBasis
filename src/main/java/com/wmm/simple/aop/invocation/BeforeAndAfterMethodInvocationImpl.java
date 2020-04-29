package com.wmm.simple.aop.invocation;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/4/29 16:59
 */
public class BeforeAndAfterMethodInvocationImpl implements BeforeAndAfterMethodInvocation{
    @Override
    public void before() {
        System.out.println("调用前执行了切面方法");
    }

    @Override
    public void after() {
        System.out.println("调用后执行了切面方法");
    }
}
