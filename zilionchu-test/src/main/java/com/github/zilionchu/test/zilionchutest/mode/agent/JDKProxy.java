package com.github.zilionchu.test.zilionchutest.mode.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-07 15:08
 * @Description:
 */
public class JDKProxy implements InvocationHandler {
    private Object object;
    public JDKProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>>>>>>>>> before >>>>>>>>>>");
        Object invoke = method.invoke(object, args);
        System.out.println(">>>>>>>>>>> after  >>>>>>>>>>");

        return invoke;
    }
}
