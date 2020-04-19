package com.wmm.springDemo.app;

import com.wmm.springDemo.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //创建应用程序的上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //已创建的上下文的 getBean() 方法来获得所需的 bean
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        //若scope没有显示配置或者配置为singleton时，helloWorld = helloWorld1
        helloWorld.setMessage("wmm");
        helloWorld.getMessage();
        HelloWorld hw = (HelloWorld) applicationContext.getBean("helloworld");
        hw.getMessage();

        User user = (User) applicationContext.getBean("user");
        user.getPhoneNumber();
        user.getDevices();

        UserRemoteService userRemoteService = (UserRemoteService) applicationContext.getBean("userRemoteService");
        userRemoteService.getUser().getName();
        userRemoteService.getServiceID();
        userRemoteService.getOrgName();

        Workers wmm = (Workers) applicationContext.getBean("workers");
        wmm.getId();
        wmm.getName();
        wmm.getOrganziation();

        Company company = (Company) applicationContext.getBean("company");
        company.getAddress();

        Device device = (Device) applicationContext.getBean("device");
        device.editOrganizationName("北京总部");
        /*ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("/target/classes/applicationContext.xml");
        HelloWorld helloWorld1 = (HelloWorld) applicationContext1.getBean("helloworld");
        helloWorld1.getMessage();*/
    }
}
