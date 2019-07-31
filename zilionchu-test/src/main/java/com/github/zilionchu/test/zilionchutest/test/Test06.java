package com.github.zilionchu.test.zilionchutest.test;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 09:29
 * @Description:
 */
public class Test06 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                i += 1;
                continue;
            }
            System.out.println(i);
        }
    }
}
