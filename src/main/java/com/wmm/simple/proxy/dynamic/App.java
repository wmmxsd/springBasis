package com.wmm.simple.proxy.dynamic;

import com.wmm.simple.proxy.dynamic.invocation.AuditMethodInvocation;
import com.wmm.simple.proxy.dynamic.proxy.DynamicProxyFactory;
import com.wmm.simple.proxy.service.AuditService;
import com.wmm.simple.proxy.service.DeviceService;
import com.wmm.simple.proxy.service.UserService;
import com.wmm.simple.proxy.service.impl.AuditServiceImpl;
import com.wmm.simple.proxy.service.impl.DeviceServiceImpl;
import com.wmm.simple.proxy.service.impl.UserServiceImpl;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 15:00
 */
public class App {
    public static void main(String[] args) {
        AuditService auditService = new AuditServiceImpl();

        UserService userService = new UserServiceImpl();
        AuditMethodInvocation auditMethodInvocation = new AuditMethodInvocation(userService, auditService);
        UserService userServiceProxy = (UserService) DynamicProxyFactory.getProxy(userService, auditMethodInvocation);
        userServiceProxy.dress();

        DeviceService deviceService = new DeviceServiceImpl();
        AuditMethodInvocation auditMethodInvocation1 = new AuditMethodInvocation(deviceService, auditService);
        DeviceService deviceServiceProxy = (DeviceService) DynamicProxyFactory.getProxy(deviceService, auditMethodInvocation1);
        deviceServiceProxy.shutdown();
    }
}
