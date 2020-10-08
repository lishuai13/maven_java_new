package flow;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Properties集合是唯一一个和流结合使用的集合
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("杨幂","160");
        prop.setProperty("赵丽颖","150");
        prop.setProperty("古力娜扎","180");
        prop.setProperty("迪丽热巴","170");

        //将集合中的键全部取出放入Set集合
        Set<String> strings = prop.stringPropertyNames();
        //遍历
        for (String string : strings) {
            System.out.println(string+"->"+prop.getProperty(string));
        }

        //outPut(prop);
        Input();
    }

    private static void outPut(Properties p) throws IOException {
        //1.创建一个字符输出流
        FileWriter fw = new FileWriter("E:\\File\\test.txt");
        //2.调用store方法将集合中的数据写入到文件中
        p.store(fw,"save data");
        //3.关闭流
        fw.close();
    }

    private static void Input() throws IOException {
        Properties prop = new Properties();
        //1.创建一个字符输入流
        FileReader fr = new FileReader("E:\\File\\test.txt");
        //2.调用load方法读取键值对
        prop.load(fr);
        //遍历集合
        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"->"+prop.getProperty(string));
        }
    }
}
