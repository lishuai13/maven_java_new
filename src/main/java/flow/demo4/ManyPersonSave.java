package flow.demo4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 多个对象序列化与反序列化
 */
public class ManyPersonSave {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person>list = new ArrayList<>();
        list.add(new Person("李帅",18));
        list.add(new Person("张家诚",20));
        list.add(new Person("黄嘉祥",19));
        list.add(new Person("宋忠正",18));
        //序列化集合
        serialize(list);
        //反序列化集合
        deserialization(list);
    }

    private static void serialize(List list) throws IOException {
        FileOutputStream fos = new FileOutputStream("out/4.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //序列化集合
        oos.writeObject(list);
        oos.close();
    }

    private static void deserialization(List list) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("out/4.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        List list1 = (ArrayList<Person>)o;
        for (Object o1 : list1) {
            System.out.println(o1.toString());
        }
        fis.close();
    }
}
