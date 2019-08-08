package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 17:28
 * @Description:
 */
public class TypeCAdapterObject implements TypeUSB {

    private TypeC typeC;

    public TypeCAdapterObject(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void doUSB() {
        typeC.doTypeC();

    }
}
