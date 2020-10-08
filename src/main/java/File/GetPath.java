package File;

import java.io.File;

/**
 * File类获取路径的方法
 */
public class GetPath {
    public static void main(String[] args) {

        //获取绝对路径
        getAbsolutePath();
        //获取输入的路径
        path();
        //获取文件路径的最后一个名称，文件名或者文件夹名
        name();
        //获取文件的字节数，文件不存在或者是文件夹均为0
        length();

    }

    private static void length() {
        File f1 = new File("D:\\JDK帮助文档\\jdk1.8中文版.chw");
        long length = f1.length();
        System.out.println(length);
    }

    private static void name() {
        File f1 = new File("test:\\a.txt");
        String name = f1.getName();
        System.out.println(name);
    }

    private static void path() {
        File f1 = new File("test:\\a.txt");
        String path = f1.getPath();
        System.out.println(path);
    }

    private static void getAbsolutePath() {
        File f1 = new File("a.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
    }
}
