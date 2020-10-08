package generic.demo6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 泛型接口的类型擦除
 * 桥接方法
 * 实现类重写方法，会重写两次方法，一个类型为传入的类型String，一个是T类型，也就是Object
 */
public interface GenericInterface<T> {
    T getKey();
}

class Test implements GenericInterface<String>{

    @Override
    public String getKey() {
        return "test6";
    }

    public static void main(String[] args) {
        Test test = new Test();
        Class<? extends Test> aClass = test.getClass();
        //获取g类对象的所有成员方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        //输出成员方法的名字和返回值类型
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+":"+declaredMethod.getReturnType().getSimpleName());
        }
    }
}
