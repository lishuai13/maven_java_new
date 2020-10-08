package exception;

import jdk.vm.ci.hotspot.HotSpotVMConfigAccess;

/**
 * 异常处理测试
 * @author lishuai
 */
public class ExceptionTest {

    public static void test(int a,int b) throws Exception {
        if (b==0)
            throw new Exception("被除数不能为0");
        System.out.println(a/b);
    }


    public static void main(String[] args) {

//        try {
//            System.out.println(1/0);
//            System.out.println("11111");
//        } catch (Error e) {
//            System.out.println("铺货");
//            return;
//        }finally {
//            System.out.println("肯定会执行的代码块");
//        }
//        System.out.println("程序结束");

        try {
            test(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
