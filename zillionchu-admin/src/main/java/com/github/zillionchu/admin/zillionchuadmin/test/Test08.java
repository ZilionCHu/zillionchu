package com.github.zillionchu.admin.zillionchuadmin.test;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/28 17:02
 * @Description:
 */
public class Test08 extends Thread {


    public Test08(){
        super("Test");
    }

    public static void main(String[] args) {
        Test08 test08=new Test08();
    }


    @Override
    public void run() {
        //super.run();


        System.out.println("1111");
    }
}
