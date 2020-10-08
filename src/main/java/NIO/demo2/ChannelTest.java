package NIO.demo2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 通道测试之复制图片
 */
public class ChannelTest {
    public static void main(String[] args) throws IOException{
        //channel1();
        //channel2();
        channel3();
    }

    //获取流的通道，非直接缓冲区
    private static void channel1() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("E:\\File\\test.jpg"));
        FileOutputStream outputStream = new FileOutputStream(new File("E:\\File\\new.jpg"));

        // 获取通道
        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

        // 分配缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        // 将通道中数据存入缓冲区
        while(inputChannel.read(byteBuffer) != -1){
            // 切换成读取数据的模式
            byteBuffer.flip();
            //缓冲区中数据写到通道中区
            outputChannel.write(byteBuffer);
            // 清空缓冲区
            byteBuffer.clear();
        }
        System.out.println("读写成功");
    }

    //直接缓冲区
    private static void channel2() throws IOException {
        FileChannel inputChannel = FileChannel.open(Paths.get("E:\\File\\test.jpg"), StandardOpenOption.READ);
        FileChannel outputChannel = FileChannel.open(Paths.get("E:\\File\\new1.jpg"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
        // 内存映射文件
        MappedByteBuffer inputBuffer = inputChannel.map(FileChannel.MapMode.READ_ONLY,0,inputChannel.size());
        MappedByteBuffer outputBuffer = outputChannel.map(FileChannel.MapMode.READ_WRITE,0,inputChannel.size());

        byte [] bytes = new byte[inputBuffer.limit()];
        inputBuffer.get(bytes);
        outputBuffer.put(bytes);

        inputChannel.close();
        outputChannel.close();
    }

    //通道之间的数据传递
    private static void channel3() throws IOException {
        FileChannel inputChannel = FileChannel.open(Paths.get("E:\\File\\test.jpg"), StandardOpenOption.READ);
        FileChannel outputChannel = FileChannel.open(Paths.get("E:\\File\\new3.jpg"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);

        // 两种方式都
        //inputChannel.transferTo(0,inputChannel.size(),outputChannel);
        outputChannel.transferFrom(inputChannel,0,inputChannel.size());

        inputChannel.close();
        outputChannel.close();
    }
}
