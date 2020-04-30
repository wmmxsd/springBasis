package com.wmm.spring.services.init.initImpl;

import com.wmm.spring.services.init.WebAppStartUpLoader;
import org.springframework.stereotype.Component;

@Component
public class MenuLoader implements WebAppStartUpLoader {
    @Override
    public void load() {
        System.out.println("加载菜单");
    }
}
