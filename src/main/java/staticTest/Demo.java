package staticTest;

/**
 * 静态代码块，匿名代码块测试
 */
public class Demo {
    static {
        System.out.println("静态代码块执行");
    }
    {
        System.out.println("匿名代码块执行");
    }
    public Demo(){
        System.out.println("构造方法执行");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("------------------------------");
        Demo demo2 = new Demo();

    }
}
