package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 15:28
 * @Description:
 */
public class Adapter implements TatGet {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void reuest() {
        adaptee.specificRequest();
    }

    public static void main(String[] args) {
        TatGet target = new Adapter();
        target.reuest();
    }
}
