package com.github.zilionchu.test.zilionchutest.test;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 09:29
 * @Description:
 */
public class Test06 {

    public static void main(String[] args) {
        String mobile="18988888888";
        String desensMobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println(desensMobile);
    }
}
