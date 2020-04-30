package com.wmm.spring.lifecycle;

import com.wmm.spring.lifecycle.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/4/30 19:39
 */
public class App {
    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");

        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        Person person = factory.getBean("person",Person.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        factory.registerShutdownHook();
    }
}
