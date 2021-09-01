package MyTest.demo3;

import java.util.Arrays;

/**
 * 参数传递之值传递
 */
public class ParamPass1 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("pass方法调用前，i的值为=" + i);
        test(i);
        System.out.println("pass方法调用后，i的值为=" + i);

        int[] a = {1,2,3};  //数组也是对象，传递的是地址
        System.out.println("方法前："+Arrays.toString(a));
        test(a);
        System.out.println("方法后："+Arrays.toString(a));
    }

    private static void test(int[] a) {
        a[0]=5;
    }

    private static void test(int i) {
        i *= 3;
        System.out.println("pass方法中，i的值为=" + i);
    }
}