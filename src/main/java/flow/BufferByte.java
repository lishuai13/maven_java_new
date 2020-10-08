package flow;

import java.io.*;

/**
 * 缓冲流之字节流
 * BufferedOutputStream extends FileOutputStream
 * BufferedInputStream extends FileInputStream
 * 为字节流建立缓冲区来提高读写效率，写入时需使用flush方法刷新数据，close方法也有此效果
 */
public class BufferByte {
    public static void main(String[] args) throws IOException {

        //outPut();
        inPut();

    }
    //写
    private static void outPut() throws IOException {

        FileOutputStream fos = new FileOutputStream("E:\\File\\test.txt");
        //1.传入字节输出流，创建Buffer对象，不设置size大小会采用默认值
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
        //一次写入多个字节
        bos.write("雷霆嘎巴，欧青拉少！".getBytes());
        bos.flush();
        //关闭缓冲流，即可关闭字节流
        bos.close();
    }
    //读
    private static void inPut() throws IOException {

        FileInputStream fis = new FileInputStream("E:\\File\\test.txt");
        //1.传入字节输出流，创建Buffer对象，不设置size大小会采用默认值
        BufferedInputStream bis = new BufferedInputStream(fis);
        //一次读取多个字节
        int len=0;
        byte[] b = new byte[1024];
        while ((len=bis.read(b))!=-1)
            System.out.println(new String(b,0,len));
        //关闭缓冲流，即可关闭字节流
        bis.close();
    }
}
