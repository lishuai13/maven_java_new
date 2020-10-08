package jvm.classLoader;

/**
 * 类加载器
 */
public class Car {

    public static void main(String[] args) {
        //运行的时候抽象的类被加载进来
        //类实例化为对象
        Car car = new Car();
        Car car1 = new Car();
        //获取对象的hash值（不同）
        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        //获取对象的类的hash值（相同）
        System.out.println(car.getClass().hashCode());
        System.out.println(car1.getClass().hashCode());
        //获取类加载器（AppClassLoader）
        System.out.println(car.getClass().getClassLoader());
        //类加载器的父级加载器（PlatformClassLoader）
        System.out.println(car.getClass().getClassLoader().getParent());
        //类加载器的爷级加载器（root）
        System.out.println(car.getClass().getClassLoader().getParent().getParent());

    }
}
