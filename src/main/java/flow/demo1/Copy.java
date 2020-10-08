package flow.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流复制图片测试
 */
public class Copy {
    public static void main(String[] args) throws IOException {
        //1.读取图片
        FileInputStream fis = new FileInputStream("C:\\Users\\lishuai\\Desktop\\images\\3.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\File\\3-1.jpg");
        int len = 0;
        //一个一个字节读取与写入,速度较慢
//        while ((len=fis.read())!=-1)
//            fos.write(len);
        //一次读取和写入一个字节数组，效率比较高
        byte[] b = new byte[1024];
        while ((len=fis.read(b))!=-1)
            fos.write(b);
        fos.close();
        fis.close();

    }
}
