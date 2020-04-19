package com.wmm.simple.aop.invocation;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:58
 */
public class VertifyMethodInvocation implements MethodInvocation{
    @Override
    public void invoke() {
        System.out.println("登录校验");
    }
}
