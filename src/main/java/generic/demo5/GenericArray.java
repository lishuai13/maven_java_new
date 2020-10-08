package generic.demo5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 泛型数组的创建
 */
public class GenericArray<T> {

    //不能直接创建泛型数组，应该先声明
    T[] array;

    //再利用Array.newInstance方法创建数组
    public GenericArray(Class<T>clz,int length) {
        array= (T[]) Array.newInstance(clz,length);
    }

    public void put(int index,T elem){
        array[index]=elem;
    }

    public T get(int index){
        return array[index];
    }

    public T[] getArray(){
        return array;
    }

    public static void main(String[] args) {
        GenericArray ga = new GenericArray(String.class,3);
        ga.put(0,"西瓜");
        ga.put(1,"香蕉");
        ga.put(2,"苹果");

        System.out.println(Arrays.toString(ga.getArray()));
    }
}
