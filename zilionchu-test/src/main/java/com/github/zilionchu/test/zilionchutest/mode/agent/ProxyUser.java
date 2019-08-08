package com.github.zilionchu.test.zilionchutest.mode.agent;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-07 14:31
 * @Description:
 */
public class ProxyUser implements User {


    private RealUser realUser;

    public ProxyUser(RealUser realUser) {
        this.realUser = realUser;
    }


    @Override
    public void doSomething() {
        before();
        realUser.doSomething();
        after();
    }

    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");

    }


}
