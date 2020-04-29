package com.wmm.keynote;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/15 14:54
 */
public class DoubleJudgeSingleton {
    /**
     * 加上volatile后不会进行指令重排序。
     */
    private volatile static DoubleJudgeSingleton instance;


    private DoubleJudgeSingleton() {
    }

    public static DoubleJudgeSingleton getInstance() {
        //避免被实例化两次
        if (instance == null) {
            synchronized (DoubleJudgeSingleton.class) {
                //避免指令重排序造成的对象未进行初始化操作
                if (instance == null) {
                    instance = new DoubleJudgeSingleton();
                }
            }
        }
        return instance;
    }
}
