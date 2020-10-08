package File.demo2;

import java.io.File;

/**
 * 递归搜索指定类型的文件
 */
public class FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\大三下\\Linux实验");
        recursion(file);
    }

    private static void recursion(File file) {
        if (!file.exists())
            System.out.println("文件夹不存在");
        //调用过滤器来过滤文件
        //File[] files = file.listFiles(new FilterImpl());
        //lambda表达式简化操作
        File[] files = file.listFiles((pathname)-> pathname.getName().endsWith(".txt")||pathname.isDirectory());
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

/**
 * 过滤器接口的实现方法
 */
class FilterImpl implements java.io.FileFilter{

    //重写过滤规则，为true则保留，返回为false则被过滤掉。
    @Override
    public boolean accept(File pathname) {
        //是文件夹或者txt文件的保留
        if (pathname.isDirectory())
            return true;
        else
            return pathname.getName().endsWith(".txt");
    }
}
