package com.github.zillionchu.admin.zillionchuadmin.Singleton;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 18:27
 * @Description:
 */
public class SingletonEx1 {

    private SingletonEx1() {

    }

    private  static  SingletonEx1 singletonEx1 = null;

    public static SingletonEx1 getSingletonEx1() {
        if (singletonEx1 == null) {
            singletonEx1 = new SingletonEx1();
        }
        return singletonEx1;
    }


}
