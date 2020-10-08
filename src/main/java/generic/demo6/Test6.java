package generic.demo6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 传入泛型类的实参Integer和泛型方法的实参Integer
 * 通过反射获取成员变量的和方法类型
 * 说明类型被擦除
 */
public class Test6 {

    public static void main(String[] args) {
        Generic6<Integer> g = new Generic6<>();
        g.show(5);
        //通过反射获取g的类对象
        Class<? extends Generic6> aClass = g.getClass();
        //获取g类对象的所有成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        //获取g类对象的所有成员方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        //输出成员变量的名字和类型
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+":"+declaredField.getType().getSimpleName());
        }
        //输出成员方法的名字和返回值类型
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+":"+declaredMethod.getReturnType().getSimpleName());
        }
    }
}
