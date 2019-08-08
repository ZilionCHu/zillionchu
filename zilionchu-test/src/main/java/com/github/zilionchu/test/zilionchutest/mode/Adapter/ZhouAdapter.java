package com.github.zilionchu.test.zilionchutest.mode.Adapter;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-08 15:40
 * @Description:
 */
public class ZhouAdapter implements Player {
    private Zhou zhou = new Zhou();

    @Override
    public void attack() {
        zhou.doI();

    }

    @Override
    public void defense() {
        zhou.doII();

    }


    public static void main(String[] args) {
        Player player = new ZhouAdapter();
        player.attack();
        player.defense();
    }
}
