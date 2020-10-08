package flow;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流
 * FileReader extends OutputStreamReader (转换流)
 */
public class CharInput {
    public static void main(String[] args) throws IOException {
        charInput();
    }

    private static void charInput() throws IOException {
        FileReader fr = new FileReader("E:\\File\\test.txt");
        int len = 0;
        //一个一个字符读取，返回的是码值，然后再转换输出
//        while ((len=fr.read())!=-1)
//            System.out.println((char)len);
        //多个字符一起读取，输出
        char[] chars = new char[1024];
        while ((len=fr.read(chars))!=-1)
            //把字符数组的有效位转换为字符串输出
            System.out.println(new String(chars,0,len));
        fr.close();
    }
}
