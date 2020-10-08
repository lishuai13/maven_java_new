package jvm.memoryAnalysis;

/**
 * 堆内存探究
 */
public class Heap {
    public static void main(String[] args) {
        //堆试图申请的最大内存,单位字节
        long max = Runtime.getRuntime().maxMemory();
        //堆实际分配的最大内存，单位字节
        long total = Runtime.getRuntime().totalMemory();

        System.out.println(max/(1024*1024)+"MB");
        System.out.println(total/(1024*1024)+"MB");

//        4070MB,默认申请是内存的1/4
//        256MB,实际分配的是内存的1/64
    }
}
