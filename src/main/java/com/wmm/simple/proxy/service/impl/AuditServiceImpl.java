package com.wmm.simple.proxy.service.impl;

import com.wmm.simple.proxy.service.AuditService;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 14:54
 */
public class AuditServiceImpl implements AuditService {
    @Override
    public void audit() {
        System.out.println("审计该操作——success");
    }
}
