import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest
{
    static int i =20;
    @Test
    public void test(){
        MyTest test = new MyTest();
        test.i++;
        MyTest test1 = new MyTest();
        test1.i++;
        MyTest.i++;
        System.out.println(i);
    }

    //
    @Test
    public void test1(){
        String str ="abcd";
        String replace = str.replace("ab", "ff");
        System.out.println(replace);
    }

    @Test
    public void test2(){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s9);
        System.out.println(s4 == s5);
        System.out.println(s1 == s6);
    }

    @Test
    public void test3(){
        String s1 = "Hello";
        System.out.println(s1.hashCode());
        s1="1111";
        System.out.println(s1.hashCode());
        System.out.println("----------------");
        int[] a ={1};
        System.out.println(Arrays.hashCode(a));
        a[0]=2;
        System.out.println(Arrays.hashCode(a));
        System.out.println("----------------");
    }

    @Test
    public void test4(){
        double a = 1.3;
        double b = 1.2;
        double result = a-b;
        System.out.println(result);

        System.out.println(new BigDecimal("1.3").subtract(new BigDecimal("1.2")));
        //0.10000000000000009
        //0.1
    }

    @Test
    public  void test5(){
        int [][] arr={{4,5,6,8},{2,3},{1,6,9}};


        System.out.println(arr.length);//输出行数
        System.out.println(arr[0].length);//输出列数
    }

}
