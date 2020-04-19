package com.wmm.designmode.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/17 16:59
 */
public class Event extends ApplicationEvent {
    private static final long serialVersionID = 1L;

    private String message;

    public Event (Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
