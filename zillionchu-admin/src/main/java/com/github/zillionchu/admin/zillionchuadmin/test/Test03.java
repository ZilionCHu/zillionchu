package com.github.zillionchu.admin.zillionchuadmin.test;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/14 09:11
 * @Description:
 */
public class Test03 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long time = (end - start) / 1000 ;
        System.out.println(time);
        System.out.println(time /1000);
    }
}
