package flow;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流
 */
public class ByteStreamInput {
    public static void main(String[] args) throws IOException {
        //fileInputStream1();
        fileInputStream2();
    }

    //每读取一个字符，指针自动后移，读到末尾返回字节-1
    private static void fileInputStream1() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\File\\test.txt");
        int result =0;
        while ((result=fis.read())!=-1)
            System.out.println(result);
        fis.close();
    }

    //读取指定的字节数到字节数组中，返回值为字节个数，起到缓存作用
    private static void fileInputStream2() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\File\\test.txt");
        //一般定义为1024（1kb）或其的整数倍
        byte[] b = new byte[1024];
        int len = 0;
        while ((len=fis.read(b))!=-1){
        System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}
