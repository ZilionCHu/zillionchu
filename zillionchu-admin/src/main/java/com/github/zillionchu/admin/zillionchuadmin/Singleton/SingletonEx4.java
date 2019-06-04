package com.github.zillionchu.admin.zillionchuadmin.Singleton;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/22 18:27
 * @Description:
 */
public class SingletonEx4 {

    private SingletonEx4() {

    }


    private static SingletonEx4 singletonEx1 = null;

    static {
        singletonEx1 = new SingletonEx4();
    }


    public static SingletonEx4 getSingletonEx4() {
        return singletonEx1;
    }

    public static void main(String[] args) {
        System.out.println(SingletonEx4.getSingletonEx4().hashCode());
        System.out.println(SingletonEx4.getSingletonEx4().hashCode());

    }


}
