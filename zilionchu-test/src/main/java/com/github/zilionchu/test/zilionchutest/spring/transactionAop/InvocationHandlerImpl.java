package com.github.zilionchu.test.zilionchutest.spring.transactionAop;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 15:34
 * @Description:
 */
public class InvocationHandlerImpl  implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return null;
    }
}
