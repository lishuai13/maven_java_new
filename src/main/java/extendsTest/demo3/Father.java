package extendsTest.demo3;

public class Father {
    static {
        System.out.println("父类静态代码块执行！");
    }
    {
        System.out.println("父类非静态代码块执行！");
    }

    public Father() {
        System.out.println("父类构造方法执行");
    }
}
