package reflex.demo1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 通过反射获取类的信息
 */
public class GetInfo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> aClass = Class.forName("reflex.demo1.User");
        //获得类名
        String name = aClass.getName();
        System.out.println(name);

        //获得类的所有成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //获得类的指定成员变量
        Field name1 = aClass.getDeclaredField("name");
        System.out.println(name1);

        //获得类的全部方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        //获得类的指定方法，需要加上参数类型，因为存在重载
        Method declaredMethod = aClass.getDeclaredMethod("getName");
        System.out.println(declaredMethod);

        //获取类的全部构造方法
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //获取类的指定构造方法
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class,int.class,int.class);
        System.out.println(declaredConstructor);

        //获取注解
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));

    }
}
