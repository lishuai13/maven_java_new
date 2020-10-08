package flow.demo3;

import java.io.*;
/**
 * 复制文件，转换编码格式
 */
public class Change {
    public static void main(String[] args) throws IOException {
        //创建读取对象
        FileInputStream fis = new FileInputStream("out/1.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        //创建写入对象
        FileOutputStream fos = new FileOutputStream("out/2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        int len = 0;
        char[] chars = new char[1024];
        while ((len=isr.read(chars))!=-1){
            osw.write(new String(chars,0,len));
        }
        osw.close();
        isr.close();
    }
}
