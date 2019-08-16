package com.github.zilionchu.test.zilionchutest.multi;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-15 09:29
 * @Description:
 */
public class RunThreadVolatile extends Thread {

    private volatile boolean isRunning = true;

    private void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

//    public void run() {
//        System.out.println("进入run方法..");
//        int i = 0;
//        while (isRunning == true) {
//            //..
//        }
//        System.out.println("线程停止");
//    }


    @Override
    public void run() {
        System.out.println("进入run方法..");
        int i = 0;
        while (isRunning == true) {
            //..
        }
        System.out.println("线程停止");
    }

    public static void main(String[] args) throws InterruptedException {
        RunThreadVolatile rt = new RunThreadVolatile();
        rt.start();
        Thread.sleep(1000);
        rt.setRunning(false);
        System.out.println("isRunning的值已经被设置了false");
    }

}
