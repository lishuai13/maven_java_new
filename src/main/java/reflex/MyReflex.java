package reflex;

/**
 * 获取类名方法
 */
public class MyReflex {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p1 = new Student();
        p1.showName();

        //方法一：获取类方法
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getSimpleName());

        //方法二：获取类方法
        Class<?> aClass = Class.forName("reflex.Student");
        System.out.println(aClass.getSimpleName());

        //方法三：获取类方法
        Class<? extends Person> aClass1 = p1.getClass();
        System.out.println(aClass1.getSimpleName());

        //方法四：获取父类类对象
        Class<?> superclass = aClass1.getSuperclass();
        System.out.println(superclass.getSimpleName());
    }
}

abstract class Person{

    private String name;

    abstract void showName();
}

class Student extends Person{

    @Override
    void showName() {
        System.out.println("我是学生");
    }
}

class Teacher extends Person{

    @Override
    void showName() {
        System.out.println("我是老师");
    }
}
