package flow.demo2;

import java.io.*;

/**
 * 文本异常处理，新改进
 * 可以在try后的括号中定义对象，作用域就在之后的花括号，然后自动关闭，不用finally{close}
 */
public class NewTry {
    public static void main(String[] args){

        try (FileReader fis = new FileReader("D:\\students.txt");
             FileWriter fos = new FileWriter("E:\\File\\student.txt")) {
            int len = 0;
            //一次读取和写入一个字节数组，效率比较高
            char[] chars = new char[1024];
            while ((len=fis.read(chars))!=-1)
                fos.write(chars);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
