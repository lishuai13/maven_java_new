package extendsTest.demo3;

public class Son extends Father{
    static {
        System.out.println("子类静态代码块执行！");
    }
    {
        System.out.println("子类非静态代码块执行！");
    }
    public Son() {
        System.out.println("子类构造方法执行");
    }
}
