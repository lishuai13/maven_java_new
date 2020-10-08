package reflex;

/**
 * 获取加载类测试
 */
public class LoadClass {

    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类--》扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类--》根加载器(C/C++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        //获取当前类的加载器
        ClassLoader classLoader = Class.forName("reflex.LoadClass").getClassLoader();
        System.out.println(classLoader);
        //获取Object的加载器
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

    }
}
