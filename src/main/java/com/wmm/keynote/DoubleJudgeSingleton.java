package com.wmm.keynote;

/**
 * @author wangmingming160328
 * @Description
 * @date @2020/1/15 14:54
 */
public class DoubleJudgeSingleton {
    private volatile static DoubleJudgeSingleton instance;  //加上volatile后不会进行指令重排序。


    private DoubleJudgeSingleton() {
    }

    public static DoubleJudgeSingleton getInstance() {
        int[] strings = {1,2,3};
        int[] ints = new int[2];
        int[] ints1 = new int[]{1,2,3};
        if (instance == null) { //避免被实例化两次
            synchronized (DoubleJudgeSingleton.class) {
                if (instance == null) { //避免指令重排序造成的对象未进行初始化操作
                    instance = new DoubleJudgeSingleton();
                }
            }
        }
        return instance;
    }
}
