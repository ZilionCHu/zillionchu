package com.github.zilionchu.test.zilionchutest.single;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-24 13:37
 * @Description:
 */
public class SingletonTest03 {

    private SingletonTest03() {

        System.out.println("init...................");
    }

    public static class InnerSingletonClass {
        private static final SingletonTest03 singletonTest03 = new SingletonTest03();
    }

    public static SingletonTest03 getInstance() {
        return InnerSingletonClass.singletonTest03;
    }


    public static void main(String[] args) {
        SingletonTest03 instance = getInstance();
        SingletonTest03 instance1 = getInstance();

        System.out.println(instance.hashCode() == instance1.hashCode());
    }


}
