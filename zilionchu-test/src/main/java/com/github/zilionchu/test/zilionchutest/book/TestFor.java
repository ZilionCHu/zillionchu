package com.github.zilionchu.test.zilionchutest.book;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-11 10:51
 * @Description:
 */
public class TestFor {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            int j = 0;
            do {
                j++;
                if (j == 2) {
                    break;
                }
                // System.out.println("do while j is :" + j);
            } while (j <= i);
            //System.out.println("for i is :" + i);
            System.out.println("for j is :" + j);

        }
        // System.out.println(super.getClass().getName());
        // System.out.println(this.getClass().getName());
        //this.getClass().getName();
    }
}
