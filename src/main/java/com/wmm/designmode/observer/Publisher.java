package com.wmm.designmode.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/17 17:04
 */
@Component
public class Publisher implements ApplicationEventPublisher {
    @Override
    public void publishEvent(ApplicationEvent event) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Publisher：发布事件，时间为：" + format.format(new Date(event.getTimestamp())));
    }

    @Override
    public void publishEvent(Object event) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Publisher：发布事件，事件为：" + event.toString());
    }
}
