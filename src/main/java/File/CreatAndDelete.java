package File;

import java.io.File;
import java.io.IOException;

/**
 * 创建和删除
 */
public class CreatAndDelete {

    public static void main(String[] args) throws IOException {
        //创建新文件，路径不存在或文件已存在均返回false
        creatFile();
        //创建新文件夹，路径不存在或文件夹已存在均返回false
        creatDirectory();
        //删除文件和空的文件夹，跳过回收站
        delete();
    }

    private static void creatFile() throws IOException {
        File file = new File("E:\\newFile");
        System.out.println(file.createNewFile());
    }

    private static void creatDirectory() {
        File file = new File("E:\\newDirectory");
        System.out.println(file.mkdir());
        //创建多级文件夹
        File file2 = new File("E:\\newDirectory1\\1\\2");
        System.out.println(file2.mkdirs());
    }

    private static void delete() {
        File file = new File("E:\\newFile");
        System.out.println(file.delete());
        File file2 = new File("E:\\newDirectory1\\1\\2");
        System.out.println(file2.delete());
        File file3 = new File("E:\\newDirectory");
        System.out.println(file3.delete());
    }
}
