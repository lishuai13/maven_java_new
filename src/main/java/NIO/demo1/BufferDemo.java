package NIO.demo1;

import java.nio.ByteBuffer;

/**
 * 关于 Buffer 类的demo
 */
public class BufferDemo {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        System.out.println("-------初始的操作位置，操作界限，缓冲区容量----------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        String str = "abcde";
        byteBuffer.put(str.getBytes());
        System.out.println("-------加入数据后的操作位置，操作界限，缓冲区容量----------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());


        byteBuffer.flip();
        System.out.println("-------切换为读模式后的操作位置，操作界限，缓冲区容量----------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        byteBuffer.mark(); //标记当前的位置

        System.out.println("-------读完后的操作位置，操作界限，缓冲区容量----------");
        byte[] bytes = new byte[byteBuffer.limit()];
        byteBuffer.get(bytes);
        System.out.println(new String(bytes,0,bytes.length));
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        byteBuffer.rewind();
        byteBuffer.clear();

        byteBuffer.reset(); //回到标记的位置
        System.out.println("-------重置后----------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());


    }
}
