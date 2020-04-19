package com.wmm.simple.aop;

import com.wmm.simple.aop.aspect.AfterAdvice;
import com.wmm.simple.aop.aspect.Aspect;
import com.wmm.simple.aop.aspect.BeforeAdvice;
import com.wmm.simple.aop.invocation.AuditMethodInvocation;
import com.wmm.simple.aop.invocation.MethodInvocation;
import com.wmm.simple.aop.invocation.VertifyMethodInvocation;
import com.wmm.simple.aop.service.LoginService;
import com.wmm.simple.aop.service.LoginServiceImpl;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 11:25
 */
public class App {
    public static void main(String[] args) {
        LoginService loginService = new LoginServiceImpl();
        MethodInvocation vertifyMethodInvocation = new VertifyMethodInvocation();
        Aspect beforeAspect = new BeforeAdvice(loginService, vertifyMethodInvocation);
        LoginService loginServiceProxy = (LoginService) SimpleAop.getProxy(loginService, beforeAspect);
        loginServiceProxy.login();
        MethodInvocation auditMethodInvocation = new AuditMethodInvocation();
        Aspect afterAspect = new AfterAdvice(loginService, auditMethodInvocation);
        LoginService  loginServiceProxy1 = (LoginService) SimpleAop.getProxy(loginService, afterAspect);
        loginServiceProxy1.login();
    }
}
