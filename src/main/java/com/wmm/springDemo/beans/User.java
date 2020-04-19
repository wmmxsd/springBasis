package com.wmm.springDemo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;
import java.util.Set;


public class User implements BeanPostProcessor {
    private String id;
    private String name;
    private int age;
    private Set<String> phoneNumber;
    private List<Device> devices;

    public void getId() {
        System.out.println("Your id : " + id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void getName() {
        System.out.println("Your name : " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAge() {
        System.out.println("Your age : " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getPhoneNumber() {
        int count = 0;
        for (String pn : phoneNumber) {
            System.out.println(name + "的电话号码" + ++count + "为" + pn);
        }
    }

    public void setPhoneNumber(Set<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getDevices() {
        int count = 0;
        for (Device device : devices) {
            System.out.println(name + "的设备为" + ++count + "为" + device);
        }
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    /**
     * Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        /*System.out.println("BeforeInitialization : " + beanName);*/
        return bean;  // you can return any other object as well
    }

    /**
     * Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        /*System.out.println("AfterInitialization : " + beanName);*/
        return bean;  // you can return any other object as well
    }
}

