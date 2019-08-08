package com.github.zilionchu.test.zilionchutest.mode.agent;

import java.lang.reflect.Proxy;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-07 15:12
 * @Description:
 */
public class Test02 {

    public static void main(String[] args) {
        RealUser realUser = new RealUser();
        JDKProxy jdkProxy = new JDKProxy(realUser);
        User o = (User) Proxy.newProxyInstance(RealUser.class.getClassLoader(), new Class[]{User.class}, jdkProxy);
        o.doSomething();
    }
}
