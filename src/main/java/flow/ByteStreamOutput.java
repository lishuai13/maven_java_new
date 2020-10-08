package flow;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流输出流
 */
public class ByteStreamOutput {

    public static void main(String[] args) throws IOException {
        //fileOutputStream1();
        fileOutputStream2();
    }

    //该方法会删除之前的数据，重新写入
    private static void fileOutputStream1() throws IOException {
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("E:\\File\\test.txt");
        //2.调用方法，写入字节
        fos.write(100);
        //写入字节数组，但第一个字节数不能为负
        byte[] b = {65,67,68,66};
        fos.write(b);
        //字符串转化为字节数组写入
        String str = "你好";
        fos.write(str.getBytes());
        //3.释放资源
        fos.close();
    }

    //该方法为追加写入，不会删除之前的数据
    private static void fileOutputStream2() throws IOException {
        //1.创建对象
        FileOutputStream fos = new FileOutputStream("E:\\File\\test.txt",true);
        //2.调用方法，写入字节
        fos.write(100);
        //写入字节数组，但第一个字节数不能为负
        byte[] b = {65,67,68,66};
        fos.write(b);
        fos.write("\n".getBytes());
        //字符串转化为字节数组写入
        String str = "你好你好v你好你好";
        fos.write(str.getBytes());
        //3.释放资源
        fos.close();
    }
}
