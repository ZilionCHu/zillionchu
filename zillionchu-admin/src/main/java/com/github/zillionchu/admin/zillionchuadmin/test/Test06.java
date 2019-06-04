package com.github.zillionchu.admin.zillionchuadmin.test;

import com.github.zilionchu.core.zillionchucore.log.LoggerBase;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/27 10:45
 * @Description:
 */
//@Slf4j
public class Test06 implements LoggerBase {


    public static void getLog(){
        String s="ss";
        ////info("1-{}",s);
    }


    public static void main(String[] args) {
        //488738076

        for (int i = 0; i <10 ; i++) {
            try {

                //log.info("i#######-{}",i);
                //info();
                //getLog
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                //log.info("--finally");
            }

        }
    }
}
