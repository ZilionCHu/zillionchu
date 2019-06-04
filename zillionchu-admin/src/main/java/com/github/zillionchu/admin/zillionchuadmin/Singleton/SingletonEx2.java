package com.github.zillionchu.admin.zillionchuadmin.Singleton;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 18:27
 * @Description:
 */
public class SingletonEx2 {

    private SingletonEx2() {

    }

    private static  SingletonEx2 singletonEx1 = new SingletonEx2();

    public SingletonEx2 getSingletonEx1() {
       return singletonEx1;
    }


}
