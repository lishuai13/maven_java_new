package File;

import java.io.File;

/**
 * 遍历文件夹
 * 如果给定的路径指示的不是文件夹或者文件夹不存在，则会抛出空指针异常。
 * 可以遍历出隐藏文件
 */
public class Ergodic {
    public static void main(String[] args) {
        //遍历结果返回到一个String数组中
        ergodic1();
        //遍历结果返回到一个File对象数组中
        ergodic2();
    }

    private static void ergodic2() {
        File file = new File("D:\\大三下");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void ergodic1() {
        File file = new File("D:\\大三下");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
