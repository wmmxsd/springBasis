package com.wmm.annotations.javaclass;

import com.wmm.annotations.custom.Test;
import com.wmm.annotations.custom.World;

/**
 * @author wangmingming160328
 * @Description 使用Test注解和World注解的类
 * @date @2020/1/16 16:00
 */
public class AnnotationTest {
    @Test(name = "annotationTest1", method = {"test01", "test02"})
    public void test() {
        System.out.println("正在测试");
    }

    @World(value = "world")
    public void testWorldAnnotation() {
        System.out.println("正在测试World注解");
    }
}
