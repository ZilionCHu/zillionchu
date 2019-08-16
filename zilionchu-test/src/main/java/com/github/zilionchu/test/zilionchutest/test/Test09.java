package com.github.zilionchu.test.zilionchutest.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-15 10:13
 * @Description:
 */
public class Test09 extends Thread {

    private static volatile Boolean isRuning = true;

    @Override
    public void run() {
        System.out.println("start run............");

        while (isRuning) {
            System.out.println("running...........");
        }

        System.out.println("stop run.............");
    }

    public static void main(String[] args) {

        /// UUID.randomUUID()

        String orderId = prefix() + "-" + String.format("%1$04d", 100);

//        Test09 t = new Test09();
//        t.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        isRuning = false;

        System.out.println(orderId);

    }

    public static String prefix() {
        String temp_str = "";
        Date dt = new Date();
        // 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        temp_str = sdf.format(dt);
        return temp_str;
    }
}
