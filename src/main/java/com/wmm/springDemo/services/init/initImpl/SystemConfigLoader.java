package com.wmm.springDemo.services.init.initImpl;

import com.wmm.springDemo.services.init.WebAppStartUpLoader;
import org.springframework.stereotype.Component;

@Component
public class SystemConfigLoader implements WebAppStartUpLoader {
    @Override
    public void load() {
        System.out.println("加载系统资源");
    }
}
