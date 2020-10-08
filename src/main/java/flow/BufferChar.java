package flow;

import java.io.*;

/**
 * 缓冲流之字符流
 * 为字符流建立缓冲区来提高读写效率，写入时需使用flush方法刷新数据，close方法也有此效果
 * BufferedWriter extends Writer
 * BufferedReader extends Reader
 */
public class BufferChar {

    public static void main(String[] args) throws IOException {

        //outPut();
        inPut();

    }
    //读取，新方法readLine，读取一行，不包含换行符，末尾返回null
    private static void inPut() throws IOException {
        FileReader fr = new FileReader("E:\\File\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null)
            System.out.println(line);
        br.close();
    }

    //写，有自己的特有换行方法newLine
    private static void outPut() throws IOException {
        FileWriter fw = new FileWriter("E:\\File\\test.txt",true);
        //同样不设置size，使用默认的大小
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("无情哈拉少！");
        //新的换行方式
        bw.newLine();
        bw.write("八爷何来！");
        bw.flush();
        bw.close();
    }
}
