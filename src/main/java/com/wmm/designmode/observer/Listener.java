package com.wmm.designmode.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/17 17:03
 */
@Component
public class Listener implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
        String message = event.getMessage();
        System.out.println("Listener做出反应，接收到的消息为：" + event.getMessage());
    }
}
