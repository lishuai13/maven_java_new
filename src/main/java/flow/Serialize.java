package flow;

import java.io.*;

/**
 * 序列化与反序列化
 * 将对象序列化成二进制的字节存储，提高存储效率
 * 对象不光包含字符，所以使用字节流
 * 实体类必须实现Serializable接口，仅是标记作用
 */
public class Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialize();
        deserialization();
    }
    //序列化
    private static void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream("out/3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("新二",560111));
        oos.close();
    }
    //反序列化
    private static void deserialization() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("out/3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o.toString());
        fis.close();
    }
}

/**
 * 实体类，必须实现序列化接口，仅仅是标记作用
 */
class Person implements Serializable {

    private String name;
    private int Id;

    public Person(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
