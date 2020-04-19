package com.wmm.annotations.javaclass;

import com.wmm.annotations.custom.Test;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/16 16:00
 */
public class AnnotationTest {
    @Test(name = "annotationTest", method = {"test01", "test02"})
    public void test() {
        System.out.println("正在测试");
    }
}
