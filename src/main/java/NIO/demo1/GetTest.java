package NIO.demo1;

import java.nio.ByteBuffer;

/**
 * get方法探究
 */
public class GetTest {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        System.out.println("---------加入数据-----------");
        byteBuffer.put("abcde".getBytes());
        System.out.println("position:"+byteBuffer.position());
        System.out.println("limit:"+byteBuffer.limit());

        System.out.println("---------get(i)-----------");
        System.out.println(byteBuffer.get(1));
        System.out.println("position:"+byteBuffer.position());

        System.out.println("---------get()-----------");
        System.out.println(byteBuffer.get());
        System.out.println("position:"+byteBuffer.position());

        System.out.println("---------flip()-----------");
        byteBuffer.flip();
        System.out.println("position:"+byteBuffer.position());
        System.out.println("limit:"+byteBuffer.limit());
    }
}
