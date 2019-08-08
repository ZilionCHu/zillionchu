package com.github.zilionchu.test.zilionchutest.mode.agent;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-07 14:37
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        ProxyUser proxyUser = new ProxyUser(new RealUser());
        proxyUser.doSomething();
    }
}
