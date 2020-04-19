package com.wmm.springDemo.app;

import com.wmm.designmode.observer.Event;
import com.wmm.designmode.observer.Listener;
import com.wmm.designmode.observer.Publisher;
import com.wmm.springDemo.beans.Device;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AopApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Publisher publisher = (Publisher) context.getBean("publisher");
        Listener listener = (Listener) context.getBean("listener");
//        Event event = new Event("hello world", "hello world");
        Event event = (Event) context.getBean("event");
        publisher.publishEvent(event);
        listener.onApplicationEvent(event);
    }
}
