package extendsTest.demo1;

public class Son extends Father {

    private String age;

    public Son() {
        System.out.println("Son空参构造执行了");
    }

    public void test(){
        System.out.println(house);
        System.out.println(super.house);
    }


    public Integer method2() {
        System.out.println("Son方法二");
        return 8;
    }

    public static void method3(){
        System.out.println("这是子类的静态方法");
    }
}
