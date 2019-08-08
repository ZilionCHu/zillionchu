package com.github.zilionchu.test.zilionchutest.mode.agent;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-07 13:18
 * @Description:
 */
public class RealUser implements User {
    @Override
    public void doSomething() {
        System.out.println(" >>>>>>>>>>>>>> RealUser is  method ");
    }
}
