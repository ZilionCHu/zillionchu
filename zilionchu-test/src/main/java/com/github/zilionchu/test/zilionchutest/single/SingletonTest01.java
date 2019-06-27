package com.github.zilionchu.test.zilionchutest.single;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-24 11:22
 * @Description:
 */
public class SingletonTest01 {

    private static SingletonTest01 singletonTest01 = new SingletonTest01();

    private SingletonTest01() {
        System.out.println("init..........");
    }

    public static SingletonTest01 getInstance() {
        return singletonTest01;
    }

    public static void main(String[] args) {

        SingletonTest01 instance = getInstance();
        SingletonTest01 instance01 = getInstance();
        System.out.println(instance.hashCode() == instance01.hashCode());
    }
}
