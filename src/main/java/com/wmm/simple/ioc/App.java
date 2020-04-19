package com.wmm.simple.ioc;

import com.wmm.simple.ioc.bean.Car;
import com.wmm.simple.ioc.bean.Wheel;

import java.io.File;
import java.net.URL;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/13 16:37
 */
public class App {
    public static void main(String[] args) throws Exception {
        URL location = SimpleIOC.class.getClassLoader().getResource("ioc.xml");
        String locationStr = new File(location.getFile()).getAbsolutePath();
        SimpleIOC bf = new SimpleIOC(locationStr);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
