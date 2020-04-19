package com.wmm.simple.aop.invocation;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:27
 */
public class AuditMethodInvocation implements MethodInvocation{
    @Override
    public void invoke() {
        System.out.println("登录操作已审计");
    }
}
