package jvm.JMM;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * volatile不能保证原子性及解决方法
 */
public class VolatileTest2 {
    //使用AtomicInteger代替Integer
    private volatile static AtomicInteger num = new AtomicInteger();
//    private volatile static int num = 0;

    private static void add(){
        num.getAndIncrement(); // 等价 num++
//        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                for (int i1 = 0; i1 < 100; i1++) {
                    VolatileTest2.add();
                }
            }).start();
        }

        TimeUnit.SECONDS.sleep(2);  //保证输出是在线程全部结束后
        System.out.println(num);
    }
}
