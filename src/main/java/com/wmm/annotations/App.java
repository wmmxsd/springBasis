package com.wmm.annotations;

import com.wmm.annotations.custom.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/16 16:04
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取AnnotationTest的Class对象
        Class clzss = Class.forName("com.wmm.annotations.javaclass.AnnotationTest");
        Method method = clzss.getMethod("test");
        if (method.isAnnotationPresent(Test.class)){
            Test test = method.getAnnotation(Test.class);
            System.out.println(test);
            System.out.println(test.name());
            System.out.println(test.result());
            System.out.println(Arrays.toString(test.method()));
        }
    }
}
