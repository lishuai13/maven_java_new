package extendsTest.demo1;

public class Father {

    private int money;
    public String house;

    public Father() {
    System.out.println("Father空参构造执行了");
    }

    public Father(int money, String house) {
        System.out.println("Father有参构造执行");
        this.money = money;
        this.house = house;
    }

    public static void method1(){
        System.out.println("父类方法一");
    }

    public Object method2(){
        System.out.println("父类方法二");
        return 2;
    }

    public static void method3(){
        System.out.println("这是父类的静态方法");
    }
}
