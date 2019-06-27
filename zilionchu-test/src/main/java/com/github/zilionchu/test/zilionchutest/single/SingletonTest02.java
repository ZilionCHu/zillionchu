package com.github.zilionchu.test.zilionchutest.single;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-24 13:30
 * @Description:
 */
public class SingletonTest02 {

    private static SingletonTest02 singletonTest02;

    public synchronized static SingletonTest02 getInstance() {
        if (singletonTest02 == null) {
            singletonTest02 = new SingletonTest02();
        }

        return singletonTest02;
    }

    public static void main(String[] args) {
        SingletonTest02 instance = getInstance();
        SingletonTest02 instance2 = getInstance();
        System.out.println(instance.hashCode() == instance2.hashCode());
    }
}
