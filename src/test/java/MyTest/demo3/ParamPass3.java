package MyTest.demo3;

import java.util.Arrays;

public class ParamPass3 {
    private final String a ="1";
    private final int[] num = {1};


    public static void main(String[] args) {
        ParamPass3 test =new ParamPass3();
        change(test.a,test.num);
        System.out.println(test.a+""+ Arrays.toString(test.num));
    }

    public static void change(String x,int[] y){
        x="2";
        y[0]=2;
    }
//    public static void change(int[] y){
//        String x = "2";
//        y[0]=2;
//    }
}
