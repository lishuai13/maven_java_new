package flow.demo2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 异常处理，finally去释放资源,传统方法，较为复杂
 */
public class OldTry {
    public static void main(String[] args){
        FileReader fis = null;
        FileWriter fos = null;
        try{
            fis = new FileReader("D:\\students.txt");
            fos = new FileWriter("E:\\File\\student.txt");
            int len = 0;
            char[] chars = new char[1024];
            while ((len=fis.read(chars))!=-1)
                fos.write(chars);
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                }catch (IOException e){
                    System.out.println(e);
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                }catch (IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}
