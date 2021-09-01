package MyTest.demo5;

public class Test {
    static int a = 3;

    String s="a"+ new String("abc");


    static {
        System.out.println(1);
        a=a+1;
    }
    {
        System.out.println(4);
        a=a+2;
    }


    public static void main(String[] args) {
        final Test test = new Test();
        System.out.println(2);
        a=a*3;
        System.out.println(a);
    }

    static {
        System.out.println(3);
        a=a/2;
    }
    {
        System.out.println(5);
        a=a+2;
    }
}
