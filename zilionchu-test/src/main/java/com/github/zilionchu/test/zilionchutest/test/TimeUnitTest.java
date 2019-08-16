package com.github.zilionchu.test.zilionchutest.test;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-01 14:08
 * @Description:
 */
public class TimeUnitTest {
    /*
        public long toMillis(long d)    //转化成毫秒
        public long toSeconds(long d)  //转化成秒
        public long toMinutes(long d)  //转化成分钟
        public long toHours(long d)    //转化成小时
        public long toDays(long d)     //转化天

     */


    public static void main(String[] args) {

        //1天有24个小时    1代表1天：将1天转化为小时
        System.out.println(TimeUnit.DAYS.toHours(1));

        //结果： 24


        //1小时有3600秒
        System.out.println(TimeUnit.HOURS.toSeconds(1));

        //结果3600


        //把3天转化成小时
        System.out.println(TimeUnit.HOURS.convert(3, TimeUnit.DAYS));
        //结果是：72


        long start = System.nanoTime();
        //try {
            //Thread.sleep(5000);
        try {
            TimeUnit.SECONDS.sleep( 5 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // } catch (InterruptedException e) {
          //  e.printStackTrace();
       // }

        long l = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - start);
        System.out.println("===== ："+l);


    }
}
