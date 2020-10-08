package reflex;

/**
 * 测试类的初始化
 */
public class Initialization {

    static {
        System.out.println("main被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
        //Grandson son = new Grandson();

        //2.调用类的静态变量，会引起类的初始化，如果是子类，则会先初始化父类
        System.out.println(Son.m);

        //3.反射的主动引用
        //Class.forName("reflex.Grandson");

        //4.子类引用父类静态变量，不会引起子类初始化,因为没有声明子类对象
        //System.out.println(Grandson.k);

        //5.数组定义类的引用，不会引起类的初始化
        //Grandson[] a = new Grandson[3];

        //6.调用类中的静态常量，也不会引起类的初始化
        //System.out.println(Grandson.n);

    }
}

class Father{

    static int k = 2222;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{

    static {
        System.out.println("子类被加载");
        m=300;
    }

    static int m =100;
    static final int n = 1;
}