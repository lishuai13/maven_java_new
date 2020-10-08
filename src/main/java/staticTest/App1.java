package staticTest;

/**
 * 静态注入，非静态
 */
public class App1 {

    static void test1(){
        System.out.println("静态方法！");
    }

    void test2(){
        System.out.println("非静态方法！");
    }

    public static void main(String[] args) {
        test1();
    }

    public void test3(){
        test1();
        test2();
    }
}
