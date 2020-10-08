package File.demo1;

import java.io.File;

/**
 * 递归遍历文件夹
 */
public class Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\大三下\\Linux实验");
        recursion(file);
    }

    private static void recursion(File file) {
        if (!file.exists())
            System.out.println("文件夹不存在");

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory())
                recursion(file1);
            if (file1.isFile())
                //输出文件
                System.out.println(file1);
        }
        //输出文件夹
        System.out.println(file);
    }
}
