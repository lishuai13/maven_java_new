package File;

import java.io.File;

/**
 * 判断文件
 */
public class JudgeFile {
    public static void main(String[] args) {

        //判断路径是否存在
        exist();
        //判断路径指示的是否是文件
        isFile();
        //判断路径指示的是否是文件夹
        isDirectory();

    }

    private static void isFile() {
        File f1 = new File("D:\\JDK帮助文档");
        System.out.println(f1.isFile());
    }

    private static void isDirectory() {
        File f1 = new File("D:\\JDK帮助文档");
        System.out.println(f1.isDirectory());
    }

    private static void exist() {
        File f1 = new File("D:\\JDK帮助文档");
        System.out.println(f1.exists());
        File f2 = new File("maven_java.iml");
        System.out.println(f2.exists());
    }
}
