package jvm.JMM;

import java.util.concurrent.TimeUnit;

/**
 *  volatile测试，保证可见性
 */
public class VolatileTest {

    private volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        new Thread(()->{
            while (flag)
                System.out.println("flag为true，线程正在运行……");
        }).start();

        TimeUnit.SECONDS.sleep(1);
        flag=false;
        System.out.println("程序结束！");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
