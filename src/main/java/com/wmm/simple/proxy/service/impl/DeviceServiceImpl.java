package com.wmm.simple.proxy.service.impl;

import com.wmm.simple.proxy.service.DeviceService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/14 14:50
 */
public class DeviceServiceImpl implements DeviceService {
    @Override
    public void shutdown() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStr = dateFormat.format(new Date());
        System.out.println(dataStr + "：关机");
    }
}
