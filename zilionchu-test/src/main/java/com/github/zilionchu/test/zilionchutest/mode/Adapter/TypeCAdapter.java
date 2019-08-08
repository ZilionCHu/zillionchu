package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 17:27
 * @Description:
 */
public class TypeCAdapter extends TypeCImpl implements TypeUSB {

    @Override
    public void doUSB() {
        doTypeC();
    }
}
