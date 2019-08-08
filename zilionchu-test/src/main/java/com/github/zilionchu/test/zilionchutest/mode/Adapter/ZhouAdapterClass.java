package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 15:50
 * @Description:
 */
public class ZhouAdapterClass extends Zhou implements Player {
    @Override
    public void attack() {
        this.doI();
    }

    @Override
    public void defense() {
        this.doII();
    }

    public static void main(String[] args) {

    }
}
