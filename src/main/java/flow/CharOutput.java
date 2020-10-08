package flow;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 * FileWriter extends OutputStreamWriter (转换流)
 * 字符输出流的写入是先写入缓冲区，然后再刷新到本地
 */
public class CharOutput
{
    public static void main(String[] args) throws IOException {
        //charOutput1();
        charOutput2();
    }
    //追加写入，true为追加，不会删除之前的内容
    private static void charOutput2() throws IOException {
        FileWriter fw = new FileWriter("E:\\File\\test1.txt",true);
        String s = "真呢到&";
        fw.write(s);
        fw.write('\n');
        fw.close();
    }

    //该方法会删除之前的数据，重新写入
    private static void charOutput1() throws IOException {
        FileWriter fw = new FileWriter("E:\\File\\test1.txt");
        fw.write(70);
        fw.write('W');
        char[] chars =  {'Z','B','C'};
        fw.write(chars);
        fw.write("无情哈拉少！");
        //使用flush方法将数据刷新到磁盘，close也有同样功能
        fw.flush();
        fw.close();
    }
}
