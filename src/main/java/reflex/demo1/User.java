package reflex.demo1;

/**
 * 简单实体类
 */
public class User {

    private String name;
    private int Id;
    private int age;

    public User() {}

    public User(String name, int id, int age) {
        this.name = name;
        Id = id;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                '}';
    }
}
