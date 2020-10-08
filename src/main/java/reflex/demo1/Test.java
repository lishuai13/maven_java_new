package reflex.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 性能比较
 */
public class Test {
    //普通方法执行时间检测
    private static void test1(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行时间："+(endTime-startTime)+"ms");
    }
    //反射方法执行时间检测
    private static void test2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> aClass = Class.forName("reflex.demo1.User");
        User user = (User) aClass.newInstance();
        Method getName = aClass.getDeclaredMethod("getName");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法执行时间："+(endTime-startTime)+"ms");
    }
    //反射方法关闭安全检测执行时间检测
    private static void test3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> aClass = Class.forName("reflex.demo1.User");
        User user = (User) aClass.newInstance();
        Method getName = aClass.getDeclaredMethod("getName");
        //关闭安全检测
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方法关闭安全检测执行时间："+(endTime-startTime)+"ms");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        test1();
        test2();
        test3();
    }
}
