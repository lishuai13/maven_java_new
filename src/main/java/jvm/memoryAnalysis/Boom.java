package jvm.memoryAnalysis;

import java.util.ArrayList;

/**
 * 这个程序很大，会把堆空间用完，出现OutOfMemoryError错误
 */
public class Boom {
    byte[] byteArray = new byte[1024*1024]; //1M = 1024K
    public static void main(String[] args) {
        ArrayList<Boom> list = new ArrayList<>();
        int count = 0;
        try {
            while (true){
                list.add(new Boom());
                count = count + 1;
            }
        }catch (Error e){
            System.out.println("count:"+count);
            e.printStackTrace();
        }
    }
}
