package com.wmm.designmode.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/17 17:03
 */
@Component
public class Listener implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String message = event.getMessage();
        System.out.println(format.format(new Date(event.getTimestamp())) + ": Listener做出反应，接收到的消息为：" + message);
    }
}
