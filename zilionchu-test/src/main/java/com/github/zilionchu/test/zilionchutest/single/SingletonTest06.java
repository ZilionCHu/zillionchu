package com.github.zilionchu.test.zilionchutest.single;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-24 14:19
 * @Description:
 */
public class SingletonTest06 {


    private SingletonTest06 singletonTest06;

    private SingletonTest06() {

    }

    public SingletonTest06 getSingletonTest06() {
        if (singletonTest06 == null) {
            synchronized (this) {
                if (singletonTest06 == null) {
                    singletonTest06 = new SingletonTest06();
                }
            }
        }
        return singletonTest06;
    }

}
