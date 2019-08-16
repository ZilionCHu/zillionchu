package com.github.zilionchu.test.zilionchutest.multi;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-14 10:02
 * @Description:
 */
public class SyncException {

    private int i = 0;

    public synchronized void operation() {
        while (true) {
            try {
                i++;
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " , i = " + i);
                if (i == 10) {
                    Integer.parseInt("a");
                  //  throw new RuntimeException();
                }
            } catch (Exception e) {
                System.out.println("error is =================:" + i);
                e.printStackTrace();
                continue;
            }
        }
    }

    public static void main(String[] args) {

        final SyncException se = new SyncException();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                se.operation();
            }
        }, "t1");
        t1.start();
    }
}
