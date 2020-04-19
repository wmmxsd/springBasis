package com.wmm.annotations.javaclass;

import com.wmm.annotations.custom.World;

import java.lang.reflect.Method;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/16 14:08
 */
public class WorldTest {
    @World(value="Hello World")
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = WorldTest.class;
        Method method = clazz.getMethod("main", String[].class);
        World world = method.getAnnotation(World.class);
        String value = world.value();
        System.out.println(value);
    }
}
