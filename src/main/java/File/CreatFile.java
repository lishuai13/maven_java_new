package File;

import java.io.File;

/**
 * 创建File对象
 */
public class CreatFile {

    public static void main(String[] args) {
        //File(String pathname)
        File f1 = new File("D:\\JDK帮助文档");
        System.out.println(f1);

        //创建从一个家长的抽象路径名和一个孩子的路径字符串的新 File实例。
        File f2 = new File(f1,"test.txt");
        System.out.println(f2);


        //创建从父路径名的字符串和一个孩子的一个新的 File实例文件。
        File f3 = new File("CCC:\\","test.txt");
        System.out.println(f3);

        //通过将给定的 file: URI到一个抽象路径名创建一个新的 File实例/
        //File(URI uri)
    }
}
