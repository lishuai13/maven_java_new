package flow;

import java.io.*;

/**
 * 转换流
 * 默认编码表是UTF-8
 * InputStreamReader extends Reader
 * OutputStreamWriter extends Writer
 */
public class ConversionFlow {
    public static void main(String[] args) throws IOException {
        //outPut();
        intPut();

    }

    private static void intPut() throws IOException {
        FileInputStream fis = new FileInputStream("out/1.txt");
        //1.创建转换流对象，传入字节流对象和编码格式，默认使用UTF-8
        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        int len = 0;
        char[] chars = new char[1024];
        //读取的是字符数组
        while ((len=isr.read(chars))!=-1)
            System.out.println(new String(chars,0,len));
        isr.close();
    }

    private static void outPut() throws IOException {
        FileOutputStream fos = new FileOutputStream("out/1.txt");
        //1.创建转换流对象，传入字节流对象和编码格式，默认使用UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        //写的是字符
        osw.write("你好！！");
        osw.close();
    }
}
