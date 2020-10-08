package reflex.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用获取到的信息
 */
public class UseInfo{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> aClass = Class.forName("reflex.demo1.User");

        //构造一个新对象,默认使用无参构造
        User user1 = (User) aClass.newInstance();
        System.out.println(user1);

        //获取构造器来新建对象、
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, int.class);
        Object o = declaredConstructor.newInstance("李帅", 560, 21);
        System.out.println(o);

        //获取方法然后使用
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        //激活方法(对象,参数值)
        setName.invoke(user1,"大帅");
        System.out.println(user1.getName());

        //获取变量，然后使用，不能直接使用私有属性，需要关闭检查
        Field name = aClass.getDeclaredField("name");
        //关闭检查
        name.setAccessible(true);
        name.set(user1,"小帅");
        System.out.println(user1.getName());
    }
}


