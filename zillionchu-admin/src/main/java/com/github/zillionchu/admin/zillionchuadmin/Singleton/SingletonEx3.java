package com.github.zillionchu.admin.zillionchuadmin.Singleton;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 18:27
 * @Description:
 */
public class SingletonEx3 {

    private SingletonEx3() {

    }

    private static SingletonEx3 singletonEx1 = null;

    public static synchronized SingletonEx3 getSingletonEx1() {


        if (singletonEx1 == null) {
            //singletonEx1 = new SingletonEx3();
            synchronized (SingletonEx3.class){
                if(singletonEx1==null){
                    singletonEx1=new SingletonEx3();

                }
            }
        }
        return singletonEx1;
    }


}
