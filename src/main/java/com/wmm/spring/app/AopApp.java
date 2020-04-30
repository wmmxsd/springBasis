package com.wmm.spring.app;

import com.wmm.designmode.observer.Event;
import com.wmm.designmode.observer.Listener;
import com.wmm.designmode.observer.Publisher;
import com.wmm.spring.services.init.SpringStartUpBean;
import com.wmm.spring.services.init.WebAppStartUpLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class AopApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Publisher publisher = (Publisher) context.getBean("publisher");
        Listener listener = (Listener) context.getBean("listener");
        Event event = (Event) context.getBean("event");
        publisher.publishEvent(event);
        listener.onApplicationEvent(event);
        SpringStartUpBean springStartUpBean = (SpringStartUpBean) context.getBean("springStartUpBean");
        springStartUpBean.destroy();
    }
}
