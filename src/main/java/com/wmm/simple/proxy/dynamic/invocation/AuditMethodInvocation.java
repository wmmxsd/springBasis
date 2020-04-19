package com.wmm.simple.proxy.dynamic.invocation;

import com.wmm.simple.proxy.service.AuditService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 14:52
 */
public class AuditMethodInvocation implements InvocationHandler {
    private Object bean;
    private AuditService auditService;

    public AuditMethodInvocation(Object bean, AuditService auditService) {
        this.bean = bean;
        this.auditService = auditService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(bean, args);
        auditService.audit();
        return null;
    }
}
