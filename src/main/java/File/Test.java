package File;

import java.io.File;

/**
 * 获取windows的路径与文件分割符
 */
public class Test {

    public static void main(String[] args) {
        //路径分隔符的字符，表示为方便的字符串。Windows是“；”，Linux是“：”。
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        //文件名称分隔符字符，表示为方便的字符串。Windows是“\”，Linux是“/”。
        String separator = File.separator;
        System.out.println(separator);
    }
}
