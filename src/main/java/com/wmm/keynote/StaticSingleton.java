package com.wmm.keynote;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/15 18:27
 */
public class StaticSingleton {
    private StaticSingleton() {
    }

    private static class StaticSingletonInstance {
        private static final StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return StaticSingletonInstance.instance;
    }
}
