package File.demo2;

import java.io.File;

/**
 * 递归搜索指定类型的文件
 */
public class Search {
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
            if (file1.isFile()){
                String name = file1.getName();
                //如果文件是txt类型的就输出
                if (name.endsWith(".txt"))
                System.out.println(file1);
            }
        }
    }
}
