package com.wmm.springDemo.services.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/17 10:50
 */
public class InitService {
    @PostConstruct
    public void initPostConstruct(){
        System.out.println("执行PostConstruct注解标注的方法");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("执行preDestroy注解标注的方法");
    }
}
