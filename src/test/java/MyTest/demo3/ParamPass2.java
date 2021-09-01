package MyTest.demo3;

/**
 * 参数传递之引用传递
 */
public class ParamPass2 {
    public static void main(String[] args) {
        ParamPass2 p = new ParamPass2();

        User user = new User();
        user.setName("张三");
        user.setAge(18);

        System.out.println("pass方法调用前，user=" + user.toString());
        p.pass2(user);
        System.out.println("pass方法调用后，user=" + user.toString());
    }

    //虚假的引用传递
    private void pass(User user) {
        user.setName("李四");
        System.out.println("pass方法中,user = " + user.toString());
    }

    //真实的引用传递
    private void pass2(User user) {
        user = new User();
        user.setName("李四");
        user.setAge(20);
        System.out.println("pass方法中,user = " + user.toString());
    }
}

class User {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", age=" + age +
                '}';
    }
}