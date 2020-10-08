package jvm.CAS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * CAS中 ABA问题的探讨
 */
public class ABATest {
    //使用AtomicStampedReference<Integer>代替AtomicInteger
    private static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100,1);

    public static void main(String[] args) {
        new Thread(()->{
            //休眠，确保线程二能拿到初始版本号
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前的值"+atomicStampedReference.getReference());
            System.out.println(atomicStampedReference.compareAndSet(100, 101, atomicStampedReference.getStamp(), atomicStampedReference.getStamp()+1));
            System.out.println("当前的值"+atomicStampedReference.getReference());
            System.out.println(atomicStampedReference.compareAndSet(101, 100, atomicStampedReference.getStamp(), atomicStampedReference.getStamp()+1));
            System.out.println("当前的值"+atomicStampedReference.getReference());
            System.out.println("线程一执行完毕-----------------------------------------------");
        }).start();

        new Thread(()->{
            int stamp = atomicStampedReference.getStamp();
            //拿到版本号后休眠，确保线程一先执行完
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前的值"+atomicStampedReference.getReference());
            System.out.println(atomicStampedReference.compareAndSet(100, 99, stamp, stamp+1));
        }).start();
    }
}
