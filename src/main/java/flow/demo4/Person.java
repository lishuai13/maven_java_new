package flow.demo4;

import java.io.Serializable;

/**
 * 实体类，必须实现序列化接口，仅仅是标记作用
 */
public class Person implements Serializable {

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
